package by.bntu.fitf.povt.vasilkov.test.util;

public class MatrixWorker {
    public static boolean isValid(int[][] m1, int[][] m2){
        return m1[0].length == m2.length;
    }

    public static int[][] randomizeMatrix(int row, int col){
        int[][] matrix = new int[row][col];
        int range = 20;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                matrix[i][j] = (int) (Math.random() * range);
            }
        }

        return matrix;
    }

    public static void printMatrix(int[][] matrix){

        int row = matrix.length;
        int col = matrix[0].length;

        for (int i = 0; i < row; i++){
            for (int j = 0; j < col; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
