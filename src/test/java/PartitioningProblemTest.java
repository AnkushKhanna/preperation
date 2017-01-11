import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class PartitioningProblemTest
{
    PartitioningProblem partitioningProblem = new PartitioningProblem();

    @Test
    public void test_partition() throws Exception
    {
        int[] arr = new int[]{5, 6, 7, 8, 9, 10};

        Assert.assertTrue(partitioningProblem.partition(arr));
    }

    @Test
    public void test_partition_false() throws Exception
    {
        int[] arr = new int[]{5, 1, 2, 10};

        Assert.assertFalse(partitioningProblem.partition(arr));
    }

}
