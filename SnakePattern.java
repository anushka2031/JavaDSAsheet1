//import java.util.Scanner;

public class SnakePattern {

    // for printing in a snake pattern
    public static void printSnakePattern(int[][] matrix) {

        System.out.println("The matrix in Snake pattern is:");
        for (int i = 0; i < matrix.length; i++) {
            // If the current row is even, print from left to right
            if (i % 2 == 0) {
                for (int j = 0; j < matrix[i].length; j++) {
                    System.out.print(matrix[i][j] + " ");
                }
            } 
            // If the current row is odd, print from right to left
            else {
                for (int j = matrix[i].length - 1; j >= 0; j--) {
                    System.out.print(matrix[i][j] + " ");
                }
            }
        }
        System.out.println(); // For a new line after printing the pattern

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);

        // System.out.print("Enter the number of rows: ");
        // int rows = sc.nextInt();
        // System.out.print("Enter the number of columns: ");
        // int cols = sc.nextInt();

        // int[][] matrix = new int[rows][cols];

        // System.out.println("Enter the elements of the matrix:");
        // for (int i = 0; i < rows; i++) {
        //     for (int j = 0; j < cols; j++) {
        //         matrix[i][j] = sc.nextInt();
        //     }
        // }

        int[][] arr = {{1,2,3} , {4,5,6} , {7,8,9}};

        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[0].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        printSnakePattern(arr);

    }
}