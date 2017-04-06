package gfg.dynamicprogramming;

public class LongestSnakeSequence
{
    public static int findShortestPath(int[][] matrix, int rows, int columns)
    {
        int[][] memory = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0) {
                    memory[i][j] = 1;
                }

                if (j != 0 && Math.abs(matrix[i][j] - matrix[i][j - 1]) == 1) {
                    memory[i][j] = memory[i][j - 1] + 1;
                }

                if (i != 0 && Math.abs(matrix[i][j] - matrix[i - 1][j]) == 1) {
                    memory[i][j] = Math.max(memory[i][j], memory[i - 1][j] + 1);
                }
            }
        }

        return findMax(memory, rows, columns);
    }

    private static int findMax(int[][] memory, int rows, int columns)
    {
        int max = memory[0][0];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                max = Math.max(max, memory[i][j]);
            }
        }
        return max;
    }
}
