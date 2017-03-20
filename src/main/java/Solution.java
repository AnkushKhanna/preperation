import java.util.ArrayList;
import java.util.List;

public class Solution
{
    //    public int solution(int[] A)
    //    {
    //        int sum = Arrays.stream(A).sum();
    //        int sumRight, sumLeft = 0;
    //        for (int i = 0; i < A.length; i++) {
    //            sumRight = sum - sumLeft - A[i];
    //            if (sumRight == sumLeft)
    //                return i;
    //            sumLeft += A[i];
    //        }
    //        return -1;
    //    }

    private static class State
    {
        private int sum = 0;

        private int score = 0;

        public State(final int sum, final int score)
        {
            this.sum = sum;
            this.score = score;
        }

        public int getSum()
        {
            return sum;
        }

        public int getScore()
        {
            return score;
        }
    }

    public static int totalScore(String[] blocks, int n)
    {
        List<State> states = new ArrayList<>();

        states.add(new State(0, 0));
        states.add(new State(0, 0));

        for (int i = 2; i < n + 2; i++) {
            if (blocks[i - 2].equals("X")) {
                int score = 2 * states.get(states.size() - 1).getScore();
                states.add(new State(states.get(states.size() - 1).getSum() + score, score));
            } else if (blocks[i - 2].equals("+")) {
                int score = states.get(states.size() - 1).getScore() + states.get(states.size() - 2).getScore();
                states.add(new State(states.get(states.size() - 1).getSum() + score, score));
            } else if (blocks[i - 2].equals("Z")) {
                if (states.size() > 2) {
                    states.remove(states.size() - 1);
                }
            } else {
                int score = Integer.parseInt(blocks[i - 2]);
                states.add(new State(states.get(states.size() - 1).getSum() + score, score));
            }
        }

        return states.get(states.size() - 1).getSum();
    }
}
