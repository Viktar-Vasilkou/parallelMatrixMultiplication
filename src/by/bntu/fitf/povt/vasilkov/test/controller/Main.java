package by.bntu.fitf.povt.vasilkov.test.controller;

import by.bntu.fitf.povt.vasilkov.test.exception.MatrixIsNotValid;
import by.bntu.fitf.povt.vasilkov.test.model.MatrixMultiplication;
import by.bntu.fitf.povt.vasilkov.test.util.MatrixWorker;

public class Main {

    public static void main(String[] args) {
        MatrixMultiplication matrixMultiplication = new MatrixMultiplication(3, 3, 3, 3);

        try {
            matrixMultiplication.calculateParallel();
        } catch (MatrixIsNotValid e){
            System.out.println(e.getMessage());
        }


        System.out.println("\nMatrix A:");
        MatrixWorker.printMatrix(matrixMultiplication.getMatrixA());

        System.out.println("\nMatrix B:");
        MatrixWorker.printMatrix(matrixMultiplication.getMatrixB());

        System.out.println("\nResult matrix:");
        MatrixWorker.printMatrix(matrixMultiplication.getResult());
    }
}
