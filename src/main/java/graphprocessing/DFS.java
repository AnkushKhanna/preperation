package graphprocessing;

import graphprocessing.model.Color;
import graphprocessing.model.Edge;
import graphprocessing.model.Graph;
import graphprocessing.model.Vertex;

public class DFS
{
    private long time;

    public void search(Graph g)
    {
        initialize(g);
        time = 0;
        for (Vertex v : g.getVertices()) {
            if (v.getColor() == Color.WHITE) {
                search(g, v);
            }
        }
    }

    private void search(Graph g, Vertex v)
    {
        time++;
        v.setColor(Color.GRAY);
        v.setStartTime(time);
        for (Edge e : g.getNeighbours(v)) {
            if (e.vertex.getColor() == Color.WHITE) {
                e.vertex.setColor(Color.GRAY);
                e.vertex.setPreviousNode(v);
                e.vertex.setDistance(v.getDistance() + e.weight);
                search(g, e.vertex);
            }
        }

        time++;
        v.setColor(Color.BLACK);
        v.setFinalTime(time);
    }

    private void initialize(final Graph g)
    {
        for (Vertex v : g.getVertices()) {
            v.setColor(Color.WHITE);
            v.setPreviousNode(null);
            v.setDistance(0L);
        }
    }
}
