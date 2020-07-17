package by.bntu.fitf.povt.vasilkov.test.model;

import by.bntu.fitf.povt.vasilkov.test.exception.MatrixIsNotValid;

import static by.bntu.fitf.povt.vasilkov.test.util.MatrixWorker.*;


public class MatrixMultiplication {

    private int rowA;
    private int colA;

    private int rowB;
    private int colB;

    private int[][] matrixA;
    private int[][] matrixB;

    private int[][] result;
    private MatrixThread[][] threads;

    public MatrixMultiplication() {

    }

    public MatrixMultiplication(int rowA, int colA, int rowB, int colB) {
        this.rowA = rowA;
        this.colA = colA;
        this.rowB = rowB;
        this.colB = colB;

        this.matrixA = randomizeMatrix(rowA, colA);
        this.matrixB = randomizeMatrix(rowB, colB);

        this.threads = new MatrixThread[rowA][colB];
        this.result = new int[rowA][colB];
    }

    public int[][] getMatrixA() {
        return matrixA;
    }

    public int[][] getMatrixB() {
        return matrixB;
    }

    public int[][] getResult() {
        return result;
    }

    public void calculateParallel() throws MatrixIsNotValid {

        if (!isValid(matrixA, matrixB)){
            throw new MatrixIsNotValid("Number of columns of the matrixA is not equal" +
                    " to the number of rows of the matrixB.");
        }

        for (int i = 0; i < rowA; i++){
            for (int j = 0; j < colB; j++){
                for (int k = 0; k < colA; k++){
                    threads[i][j] = new MatrixThread(i, j, k, matrixA, matrixB, result);
                    threads[i][j].start();
                }
            }
        }
    }
}
