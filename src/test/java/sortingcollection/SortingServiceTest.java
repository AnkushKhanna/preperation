package sortingcollection;

import com.google.common.collect.ImmutableList;
import com.google.common.collect.Lists;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class SortingServiceTest
{
    SortingService sortingService = new SortingService();

    @Test
    public void sort_by_comparable() throws Exception
    {
        AObject b = new AObject("B", 10);
        AObject c = new AObject("C", 5);
        AObject a = new AObject("A", 60);

        List<AObject> list = Lists.newArrayList(b, c, a);

        list = sortingService.sort(list);

        Assert.assertEquals(a, list.get(0));
        Assert.assertEquals(b, list.get(1));
        Assert.assertEquals(c, list.get(2));
    }

    @Test
    public void sort_by_comparator() throws Exception
    {

        AObject b = new AObject("B", 10);
        AObject c = new AObject("C", 5);
        AObject a = new AObject("A", 60);

        List<AObject> list = Lists.newArrayList(b, c, a);

        list = sortingService.sort(list, new AObjectAgeComparator());

        Assert.assertEquals(c, list.get(0));
        Assert.assertEquals(b, list.get(1));
        Assert.assertEquals(a, list.get(2));
    }

    @Test(expected = UnsupportedOperationException.class)
    public void immutable_sort_by_comparator() throws Exception
    {

        AObject b = new AObject("B", 10);
        AObject c = new AObject("C", 5);
        AObject a = new AObject("A", 60);

        List<AObject> list = ImmutableList.copyOf(new AObject[]{b, c, a});

        list = sortingService.sort(list, new AObjectAgeComparator());
    }
}
