package graphprocessing.model;

public class Vertex
{
    private Color color = Color.WHITE;

    private Vertex previousNode;

    private Long distance;

    private Long startTime;

    private Long finalTime;

    private String name;

    public Vertex(final String name)
    {
        this.name = name;
    }

    public Color getColor()
    {
        return color;
    }

    public Vertex setColor(final Color color)
    {
        this.color = color;
        return this;
    }

    public Vertex getPreviousNode()
    {
        return previousNode;
    }

    public Vertex setPreviousNode(final Vertex previousNode)
    {
        this.previousNode = previousNode;
        return this;
    }

    public Long getDistance()
    {
        return distance;
    }

    public Vertex setDistance(final Long distance)
    {
        this.distance = distance;
        return this;
    }

    public String getName()
    {
        return name;
    }

    public Long getStartTime()
    {
        return startTime;
    }

    public void setStartTime(final Long startTime)
    {
        this.startTime = startTime;
    }

    public Long getFinalTime()
    {
        return finalTime;
    }

    public void setFinalTime(final Long finalTime)
    {
        this.finalTime = finalTime;
    }
}
