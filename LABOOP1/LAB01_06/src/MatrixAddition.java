import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] matrix1 = new int[rows][cols];
        int[][] matrix2 = new int[rows][cols];
        int[][] result = new int[rows][cols];

        System.out.println("Do you want to input the matrix values? (y/n)");
        char choice = scanner.next().charAt(0);

        if (choice == 'y' || choice == 'Y') {
        	
            System.out.println("Enter elements for the first matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix1[i][j] = scanner.nextInt();
                }
            }

            System.out.println("Enter elements for the second matrix:");
            for (int i = 0; i < rows; i++) {
                for (int j = 0; j < cols; j++) {
                    matrix2[i][j] = scanner.nextInt();
                }
            }
        } else {
            System.out.println("Using constant matrices:");
            matrix1 = new int[][]{
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
            };

            matrix2 = new int[][]{
                {9, 8, 7},
                {6, 5, 4},
                {3, 2, 1}
            };

            rows = matrix1.length;
            cols = matrix1[0].length;

            System.out.println("Matrix 1:");
            printMatrix(matrix1);

            System.out.println("Matrix 2:");
            printMatrix(matrix2);
        }

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[i][j] = matrix1[i][j] + matrix2[i][j];
            }
        }

        System.out.println("Resultant Matrix after addition:");
        printMatrix(result);

        scanner.close();
    }

    public static void printMatrix(int[][] matrix) {
        for (int[] row : matrix) {
            for (int elem : row) {
                System.out.print(elem + " ");
            }
            System.out.println();
        }
    }
}
