package javabasics;

import com.google.common.base.Objects;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Queue;
import java.util.Scanner;

public class EqualChoclates
{
    static int steps = Integer.MAX_VALUE;

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int testCases = 0; testCases < t; testCases++) {
            int colleagues = in.nextInt();
            int[] arr = new int[colleagues];
            for (int i = 0; i < colleagues; i++) {
                arr[i] = in.nextInt();
            }

            State state = new State(arr, 0);
            steps = Integer.MAX_VALUE;
            Queue<State> q = new ArrayDeque<>();
            q.add(state);
            int min = minStep(new HashMap<State, Integer>(), q);
            System.out.println(min);
        }
    }

    private static int minStep(
        final HashMap<State, Integer> memory, final Queue<State> queue
    )
    {
        while (!queue.isEmpty()) {
            State state = queue.poll();
            if (state.arr.length == 0) {
                return 0;
            }

            int max = findMax(state.arr);
            int min = findMin(state.arr);

            if (state.arr[min] == state.arr[max]) {
                return state.step;
            }

            queue.add(state.increment(1, max));
            queue.add(state.increment(2, max));
            queue.add(state.increment(5, max));
        }
        return 0;
    }

    private static int findMax(int[] arr)
    {
        int max = Integer.MIN_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        return index;
    }

    private static int findMin(int[] arr)
    {
        int min = Integer.MAX_VALUE;
        int index = -1;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
                index = i;
            }
        }
        return index;
    }
}

class State
{
    public int[] arr;

    public int step;

    public State(final int[] arr, int step)
    {
        this.arr = arr;
        this.step = step;
    }

    public State increment(int increment, int nonIncIndex)
    {
        int[] arr = new int[this.arr.length];
        for (int i = 0; i < this.arr.length; i++) {
            arr[i] = this.arr[i];
            if (i != nonIncIndex) {
                arr[i] += increment;
            }
        }

        return new State(arr, this.step + 1);
    }

    @Override
    public boolean equals(final Object o)
    {
        if (this == o)
            return true;
        if (o == null || getClass() != o.getClass())
            return false;
        final State that = (State) o;
        return Arrays.equals(this.arr, that.arr);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(arr);
    }
}
