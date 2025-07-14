import java.util.Arrays;

public class BooleanMatrixPblm {

    public static void booleanMatrix(int[][] mat) {
        
        int R = mat.length;
        int C = mat[0].length;

        boolean[] rowFlag = new boolean[R];
        boolean[] colFlag = new boolean[C];

        // Step 1: Mark rows and columns
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (mat[i][j] == 1) {
                    rowFlag[i] = true;
                    colFlag[j] = true;
                }
            }
        }

        // Step 2: Modify the matrix
        for (int i = 0; i < R; i++) {
            for (int j = 0; j < C; j++) {
                if (rowFlag[i] || colFlag[j]) {
                    mat[i][j] = 1;
                }
            }
        }

    }

    public static void main(String[] args) {
        int[][] matrix = {
            {1, 0, 0, 1},
            {0, 0, 1, 0},
            {0, 0, 0, 0}
        };

        System.out.println("Original Matrix:");
        printMatrix(matrix);

        booleanMatrix(matrix);

        System.out.println("\nModified Matrix:");
        printMatrix(matrix);
    }

    public static void printMatrix(int[][] mat) {
        for (int[] row : mat) {
            System.out.println(Arrays.toString(row));
        }
    }
    
}
