public class ClockwiseRotateMatrix {

    public static void rotate(int[][] matrix){

        int n = matrix.length;

        int[][] newmatrix = new int[n][n];
        
        // Rotating the matrix.
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){
                newmatrix[j][n-i-1] = matrix[i][j];
            }
        }

        // Coping the rotated matrix into og matrix.
        for(int i=0 ; i<n ; i++){
            System.arraycopy(newmatrix[i], 0 , matrix[i], 0, n);
        }

    }

    public static void print(int[][] matrix){

        for(int i=0 ; i<matrix.length ; i++){
            for(int j=0 ; j<matrix.length ; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        
        int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9} };

        System.out.println("Original Matrix :");
        print(arr);

        rotate(arr);
        
        System.out.println("\nMatrix after 90 degree clockwise rotation :");
        print(arr);
    }
    
}
