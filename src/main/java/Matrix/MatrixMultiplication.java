package Matrix;

import java.util.Arrays;

public class MatrixMultiplication {
    public static void main(String[] args) throws Exception {
        int[][] MatrixA={
                {1,2,3},
                {4,5,6},
                {7,8,9}
        };
        int[][] MatrixB={
                {9,8,7},
                {6,5,4},
                {3,2,1}
        };
        int[][] result = Multiplication.MatrixMultiplier(MatrixA,MatrixB);
        Multiplication.printmatrix(result);

    }
}
