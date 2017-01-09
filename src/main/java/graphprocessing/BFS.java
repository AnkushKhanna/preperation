package graphprocessing;

import graphprocessing.model.Color;
import graphprocessing.model.Edge;
import graphprocessing.model.Graph;
import graphprocessing.model.Vertex;

import java.util.ArrayDeque;
import java.util.List;
import java.util.Queue;
import java.util.stream.Collectors;

public class BFS
{
    public void search(Graph g, Vertex s)
    {
        initialize(g, s);
        s.setColor(Color.GRAY);
        s.setDistance(0L);
        s.setPreviousNode(null);
        startBFS(g, s);
    }

    private void startBFS(final Graph g, final Vertex s)
    {
        Queue<Vertex> q = new ArrayDeque<>();
        q.add(s);

        while (!q.isEmpty()) {
            Vertex u = q.poll();

            List<Edge> neighbours = g.getNeighbours(u);
            for (Edge e : neighbours) {
                if (e.vertex.getColor() == Color.WHITE) {
                    e.vertex.setColor(Color.GRAY);
                    e.vertex.setDistance(u.getDistance() + e.weight);
                    e.vertex.setPreviousNode(u);
                    q.add(e.vertex);
                }
            }
            u.setColor(Color.BLACK);
        }
    }

    private List<Vertex> initialize(final Graph g, Vertex s)
    {
        return g.getVertices().stream()
            .filter(vertex -> vertex != s)
            .map(vertex -> vertex.setColor(Color.WHITE))
            .map(vertex -> vertex.setDistance(Long.MAX_VALUE))
            .map(vertex -> vertex.setPreviousNode(null))
            .collect(Collectors.toList());
    }
}
