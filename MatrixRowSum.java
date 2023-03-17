import java.util.Scanner;

public class MatrixRowSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of rows in the matrix: ");
        int numRows = input.nextInt();

        System.out.print("Enter the number of columns in the matrix: ");
        int numCols = input.nextInt();

        int[][] matrix = new int[numRows][numCols];

        System.out.println("Enter the elements of the matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                matrix[i][j] = input.nextInt();
            }
        }

        System.out.println("Matrix:");
        for (int i = 0; i < numRows; i++) {
            for (int j = 0; j < numCols; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Sum of each row:");
        for (int i = 0; i < numRows; i++) {
            int sum = 0;
            for (int j = 0; j < numCols; j++) {
                sum += matrix[i][j];
            }
            System.out.println("Row " + (i + 1) + ": " + sum);
        }

        input.close();
    }
}
