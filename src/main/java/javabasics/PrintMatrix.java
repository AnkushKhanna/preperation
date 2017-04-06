package javabasics;

public class PrintMatrix
{
    public static void printDiagnol(int[][] matrix, int rows, int columns)
    {
        for (int i = 0; i < rows; i++) {
            int c = 0;
            int r = i;
            while (r >= 0 && c < columns) {
                System.out.print(matrix[r][c] + " ");
                r--;
                c++;
            }
            System.out.println();
        }

        for (int i = 1; i < columns; i++) {
            int c = i;
            int r = rows - 1;

            while(r >=0 && c < columns){
                System.out.print(matrix[r][c] +" ");
                c++;
                r--;
            }
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int[][] a = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}, {13, 14, 15, 16}};
        printDiagnol(a, 4, 4);
    }
}
