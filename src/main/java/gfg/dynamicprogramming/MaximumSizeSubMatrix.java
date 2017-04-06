package gfg.dynamicprogramming;

public class MaximumSizeSubMatrix
{
    public static int max(int[][] matrix, int rows, int columns)
    {
        int solution[][] = new int[rows][columns];

        int max = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 || j == 0) {
                    solution[i][j] = matrix[i][j];
                } else if (matrix[i][j] == 1) {
                    if (solution[i - 1][j] > 0 && solution[i][j - 1] > 0 && solution[i - 1][j - 1] > 0) {
                        solution[i][j] = solution[i - 1][j - 1] + 1;
                    } else {
                        solution[i][j] = 1;
                    }
                    max = Math.max(max, solution[i][j]);
                }
            }
        }
        return max;
    }
}
