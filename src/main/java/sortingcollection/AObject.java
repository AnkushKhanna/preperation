package sortingcollection;

public class AObject implements Comparable<AObject>
{
    private String name;

    private int age;

    public AObject(final String name, final int age)
    {
        this.name = name;
        this.age = age;
    }

    public String getName()
    {
        return name;
    }

    public int getAge()
    {
        return age;
    }

    @Override
    public int compareTo(final AObject that)
    {
        return this.name.compareTo(that.name);
    }
}
