package graphprocessing.model;

public class Edge
{
    public Vertex vertex;
    public Long weight;

    public Edge(final Vertex end)
    {
        this(end, 1L);
    }

    public Edge(final Vertex end, final Long weight)
    {
        this.vertex = end;
        this.weight = weight;
    }
}
