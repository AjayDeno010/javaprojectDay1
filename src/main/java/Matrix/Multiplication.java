package Matrix;

public class Multiplication {
    public static int[][] MatrixMultiplier(int[][] MatrixA,int[][] MatrixB) throws Exception {
        int rowsA =MatrixA.length;
        int rowsB =MatrixB.length;
        int colsA =MatrixA[0].length;
        int colsB =MatrixB[0].length;
      if(rowsA !=colsB){
          throw new Exception("Matrix cannot multiplied");
      }
      int[][] result = new int[rowsA][colsB];
        for (int i = 0; i < MatrixA.length; i++) {
            for (int j = 0; j < MatrixB[0].length; j++) {
                int sum=0;
                for (int k = 0; k < MatrixA[0].length; k++) {
                    sum = sum +MatrixA[i][k]*MatrixB[k][j];
                }
                result[i][j]= sum;
            }

        }
        return result;
    }
    public static void printmatrix(int[][] Matrix){
        for (int i = 0; i < Matrix.length; i++) {
            for (int j = 0; j < Matrix[0].length; j++) {
                System.out.print(Matrix[i][j]+" ");
            }
            System.out.println();
        }

    }


}
