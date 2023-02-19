public class MultiplyTwoMatrix {
    public static void main(String[] args) {
        int rows1 = 2, columns1 = 3;
        int rows2 = 3, columns2 = 2;
        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6} };
        int[][] matrix2 = { {1, 2}, {3, 4}, {5, 6} };
        int[][] result = new int[rows1][columns2];
        if (columns1 != rows2) {
            System.out.println("Matrix multiplication is not possible");
        } else {
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    for (int k = 0; k < columns1; k++) {
                        result[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("Product of two matrices is:");
            for (int i = 0; i < rows1; i++) {
                for (int j = 0; j < columns2; j++) {
                    System.out.print(result[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
    
}
