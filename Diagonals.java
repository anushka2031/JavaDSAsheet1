public class Diagonals {

    static void printdiagonals(int[][] mat){

        int n=mat.length;

        // for printing the principle diagonal.
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<n ; j++){

                if(i == j){
                    System.out.print(mat[i][j] + " ");
                }

            }
        }
        System.out.println();

        // for printing the secondary diaagonal.
        for(int i=0 ; i<n ; i++){
            System.out.print(mat[i][n-1-i] + " ");
        }

    }

    public static void main(String[] args) {
        
        int[][] mat = { {1,1,4},{2,2,2},{4,3,3} };

        System.out.println("Matrix :");
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Diagonals : ");
        printdiagonals(mat);

    }
    
}
