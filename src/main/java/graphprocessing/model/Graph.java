package graphprocessing.model;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;

import java.util.List;
import java.util.Map;

import static com.google.common.base.Preconditions.checkNotNull;

public class Graph
{
    private List<Vertex> vertices;

    private Map<Vertex, List<Edge>> adj = Maps.newHashMap();

    public Graph(List<Vertex> vertices)
    {
        this.vertices = vertices;
        vertices.forEach(vertex -> adj.put(vertex, Lists.newArrayList()));
    }

    public void addNeighbours(Vertex v, Edge edge)
    {
        checkNotNull(adj.get(v), "Vertex %s is not in the graph", v.getName());
        adj.get(v).add(edge);
    }

    public List<Edge> getNeighbours(Vertex v)
    {
        return adj.get(v);
    }

    public List<Vertex> getVertices()
    {
        return ImmutableList.copyOf(vertices);
    }
}
