import java.util.ArrayList;

public class BoundaryTraversalMatrix {

    public static ArrayList<Integer> boundaryTraversal(int[][] matrix, int n, int m) {

        ArrayList<Integer> result = new ArrayList<>();

        if (n == 0 || m == 0) { // Handle empty matrix
            return result;
        }

        if (n == 1) { // Single row
            for (int j = 0; j < m; j++) {
                result.add(matrix[0][j]);
            }
        } else if (m == 1) { // Single column
            for (int i = 0; i < n; i++) {
                result.add(matrix[i][0]);
            }
        } else { // Multiple rows and columns
            // Traverse Top Row
            for (int j = 0; j < m; j++) {
                result.add(matrix[0][j]);
            }

            // Traverse Rightmost Column
            for (int i = 1; i < n; i++) {
                result.add(matrix[i][m - 1]);
            }

            // Traverse Bottom Row (Reverse)
            for (int j = m - 2; j >= 0; j--) {
                result.add(matrix[n - 1][j]);
            }

            // Traverse Leftmost Column (Reverse)
            for (int i = n - 2; i > 0; i--) {
                result.add(matrix[i][0]);
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int n = matrix.length;
        int m = matrix[0].length;

        System.out.println("Given Matrix : ");
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Boundary Traversal of matrix1: " );
        System.out.println(boundaryTraversal(matrix, n, m)); 
        // Expected: [1, 2, 3, 6, 9, 8, 7, 4]

        
    }
}
