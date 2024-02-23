import java.util.Scanner;

public class matAddMul {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number of rows for first matrix:");
        int rows1 = scanner.nextInt();
        System.out.println("Enter the number of columns for first matrix:");
        int cols1 = scanner.nextInt();

        int[][] matrix1 = new int[rows1][cols1];

        System.out.println("Enter the elements of first matrix:");
        enterMatrixElements(scanner, matrix1);

        System.out.println("Enter the number of rows for second matrix:");
        int rows2 = scanner.nextInt();
        System.out.println("Enter the number of columns for second matrix:");
        int cols2 = scanner.nextInt();

        int[][] matrix2 = new int[rows2][cols2];

        System.out.println("Enter the elements of second matrix:");
        enterMatrixElements(scanner, matrix2);

        if (cols1 != rows2) {
            System.out.println("Matrix multiplication is not possible.");
        } else {
            System.out.println("Matrix addition:");
            printMatrix(matrixAddition(matrix1, matrix2));
            System.out.println("Matrix multiplication:");
            printMatrix(matrixMultiplication(matrix1, matrix2));
        }

        scanner.close();
    }

    // Method to enter matrix elements
    private static void enterMatrixElements(Scanner scanner, int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    // Method to perform matrix addition
    private static int[][] matrixAddition(int[][] matrix1, int[][] matrix2) {
        int rows = matrix1.length;
        int cols = matrix1[0].length;
        int[][] result = new int[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        return result;
    }

    // Method to perform matrix multiplication
    private static int[][] matrixMultiplication(int[][] matrix1, int[][] matrix2) {
        int rows1 = matrix1.length;
        int cols1 = matrix1[0].length;
        int cols2 = matrix2[0].length;
        int[][] result = new int[rows1][cols2];

        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        return result;
    }

    // Method to print matrix
    private static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }
}

		
		