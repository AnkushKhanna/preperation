package gfg.dynamicprogramming;

import java.util.Scanner;

public class LongestCommonSubsequence
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int test = sc.nextInt();
        for (int i = 0; i < test; i++) {
            int t1 = sc.nextInt();
            int t2 = sc.nextInt();

            String s1 = sc.next();
            String s2 = sc.next();

            int[][] memory = new int[t1 + 1][t2 + 1];
            for (int t = 0; t < t1 + 1; t++) {
                for (int tz = 0; tz < t2 + 1; tz++) {
                    memory[t][tz] = -1;
                }
            }

            System.out.println(find(s1, s2, memory));
        }
    }

    public static int find(String s1, String s2)
    {
        int[][] memory = new int[s1.length() + 1][s2.length() + 1];
        for (int t = 0; t < s1.length() + 1; t++) {
            for (int tz = 0; tz < s2.length() + 1; tz++) {
                memory[t][tz] = -1;
            }
        }
        return find(s1, s2, memory);
    }

    public static int find(String s1, String s2, int[][] memory)
    {
        if (s1.length() == 0 || s2.length() == 0) {
            return 0;
        }

        if (s1.length() == 1 || s2.length() == 1) {
            if (s1.contains(s2) || s2.contains(s1)) {
                return 1;
            }
            return 0;
        }

        if (s1.toCharArray()[s1.length() - 1] == s2.toCharArray()[s2.length() - 1]) {
            if (memory[s1.length() - 2][s2.length() - 2] == -1) {
                int v = find(s1.substring(0, s1.length() - 1), s2.substring(0, s2.length() - 1), memory);
                memory[s1.length() - 2][s2.length() - 2] = v;
            }
            return memory[s1.length() - 2][s2.length() - 2] + 1;
        } else {
            if (memory[s1.length() - 1][s2.length() - 2] == -1) {
                int v = find(s1, s2.substring(0, s2.length() - 1), memory);
                memory[s1.length() - 1][s2.length() - 2] = v;
            }
            if (memory[s1.length() - 2][s2.length() - 1] == -1) {
                int v = find(s1.substring(0, s1.length() - 1), s2, memory);
                memory[s1.length() - 2][s2.length() - 1] = v;
            }
            return Math.max(
                memory[s1.length() - 2][s2.length() - 1],
                memory[s1.length() - 1][s2.length() - 2]
            );
        }
    }
}
