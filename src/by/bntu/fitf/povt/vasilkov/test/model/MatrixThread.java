package by.bntu.fitf.povt.vasilkov.test.model;

public class MatrixThread extends Thread{

    private int i;
    private int j;
    private int k;

    private int [][] matrixA;
    private int [][] matrixB;

    private int[][] result;

    public MatrixThread(int i, int j, int k, int[][] matrixA, int[][] matrixB, int[][] result) {
        this.i = i;
        this.j = j;
        this.k = k;

        this.matrixA = matrixA;
        this.matrixB = matrixB;

        this.result = result;
    }

    @Override
    public void run() {
        result[i][j] += matrixA[i][k] * matrixB[k][j];
    }
}
