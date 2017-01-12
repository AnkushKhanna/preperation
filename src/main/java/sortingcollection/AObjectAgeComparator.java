package sortingcollection;

import java.util.Comparator;

public class AObjectAgeComparator implements Comparator<AObject>
{
    @Override
    public int compare(final AObject o1, final AObject o2)
    {
        if (o1.getAge() > o2.getAge()) {
            return 1;
        }

        if (o1.getAge() < o2.getAge()) {
            return -1;
        }

        return 0;
    }
}
