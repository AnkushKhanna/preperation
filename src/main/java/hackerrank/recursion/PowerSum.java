package hackerrank.recursion;

import java.util.List;
import java.io.*;
import java.util.*;
import java.lang.Math;

public class PowerSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int n = sc.nextInt();
        System.out.println(solutions(x, n));

    }

    public static int solutions(int x, int n) {
        return solutions(x, n, new ArrayList<>());
    }

    private static int solutions(int x, int n, List<Integer> numbers) {
        if (x == 0) return 1;
        if (x < 0) return 0;
        int solutions = 0;

        for(int i=1; i <= (int) Math.sqrt(x); i++) {
            if(!numbers.contains(i)) {
//                List<Integer> copy = new ArrayList<>(numbers);
                numbers.add(i);
                int pow = (int) Math.pow(i, n);
                solutions += solutions(x - pow, n, new ArrayList<>(numbers));
                System.out.println(x);
            }
        }
        return solutions;
    }

}
