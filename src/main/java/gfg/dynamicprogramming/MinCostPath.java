package gfg.dynamicprogramming;

public class MinCostPath
{
    public static int cost(int[][] matrix, int r, int c)
    {
        int[][] memory = new int[matrix.length][matrix[0].length];

        return cost(matrix, r, c, memory);
    }

    public static int cost(int[][] matrix, int r, int c, int[][] memory)
    {
        if (memory[r][c] != 0) {
            return memory[r][c];
        }
        int min = 0;
        if (r == matrix.length - 1 && c == matrix[0].length - 1) {
            min = matrix[matrix.length - 1][matrix[0].length - 1];
        } else if (r == matrix.length - 1) {
            min = matrix[r][c] + cost(matrix, r, c + 1);
        } else if (c == matrix[0].length - 1) {
            min = matrix[r][c] + cost(matrix, r + 1, c);
        } else {
            min = matrix[r][c] + min(
                cost(matrix, r + 1, c),
                cost(matrix, r, c + 1),
                cost(matrix, r + 1, c + 1)
            );
        }
        memory[r][c] = min;
        return memory[r][c];
    }

    private static int min(int x, int y, int z)
    {
        return Math.min(Math.min(x, y), z);
    }
}
