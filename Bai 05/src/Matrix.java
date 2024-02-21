import java.util.Random;

public class Matrix {
    int n;
    int[][] matrixA, matrixB;

    public Matrix(int n){
        this.n = n;
        matrixA = new int[n][n];
        matrixB = new int[n][n];
        initValue();
    }
    public void initValue(){
        Random r = new Random();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixA[i][j] = r.nextInt(10);
                matrixB[i][j] = r.nextInt(10);
            }
        }
    }

    public void printMatrix(int[][] matrix){
        System.out.println("Matrix: \n----------");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println("----------");
    }
    public void printMatrixA(){
        printMatrix(matrixA);
    }

    public void printMatrixB(){
        printMatrix(matrixB);
    }

    public int[][] sumMatrix(){
        int[][] matrixSum = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixSum[i][j] = matrixA[i][j] + matrixB[i][j];
            }
        }
        return matrixSum;
    }

    public int[][] multiplyMatrix(){
        int[][] matrixResult = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrixResult[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    matrixResult[i][j] += (matrixA[i][k]*matrixB[k][j]);
                }
            }
        }
        return matrixResult;
    }
    public static void main(String[] args) {
        Matrix m = new Matrix(3);
        m.printMatrixA();
        m.printMatrixB();
//        System.out.println("A + B = ");
//        m.printMatrix(m.sumMatrix());
        System.out.println("A * B = ");
        m.printMatrix(m.multiplyMatrix());
    }
}
