import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class SolutionTest
{
    Solution solution = new Solution();

    @Test
    public void test_1() throws Exception
    {
//        int s = solution.solution(new int[]{-1, 3, -4, 5, 1, -6, 2, 1});
//        Assert.assertEquals(1, s);
//        Assert.assertEquals(0, solution.solution(new int[]{-1, 1,-1}));

        int ans = Solution.totalScore(new String[]{"5", "-2", "4", "Z", "X", "9", "+", "+"}, 8);

        Assert.assertEquals(27, ans);

        int ans1 = Solution.totalScore(new String[]{"1", "2","+", "Z"}, 4);
        Assert.assertEquals(3, ans1);
    }


}
