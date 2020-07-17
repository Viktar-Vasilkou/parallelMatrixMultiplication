package by.bntu.fitf.povt.vasilkov.test.exception;

public class MatrixIsNotValid extends Exception {
    public MatrixIsNotValid() {
    }

    public MatrixIsNotValid(String message) {
        super(message);
    }

    public MatrixIsNotValid(String message, Throwable cause) {
        super(message, cause);
    }

    public MatrixIsNotValid(Throwable cause) {
        super(cause);
    }
}
