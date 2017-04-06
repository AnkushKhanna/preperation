package gfg.dynamicprogramming;

public class RobotTravel
{
    public static int countAllPaths(int[][] matrix, int rows, int columns)
    {
        if (matrix[0][0] == -1) {
            return 0;
        }
        if (matrix[rows - 1][columns - 1] == -1) {
            return 0;
        }

        int[][] paths = new int[rows][columns];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (i == 0 && j == 0) {
                    paths[i][j] = 1;
                }

                if (matrix[i][j] != -1) {
                    if (i != 0 && paths[i - 1][j] != 0) {
                        paths[i][j] += paths[i - 1][j];
                    }

                    if (j != 0 && paths[i][j - 1] != 0) {
                        paths[i][j] += paths[i][j - 1];
                    }
                }
            }
        }

        return paths[rows - 1][columns - 1];
    }
}
