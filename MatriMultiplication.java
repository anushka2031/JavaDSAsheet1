public class MatriMultiplication {

    public static void print(int[][] mat , int r , int c){

        for(int i=0 ; i<r ; i++){
            for(int j=0 ; j<c ; j++){
                System.out.print(mat[i][j] + " ");                
            }
            System.out.println();
        }
        
    }
    
    public static void multiplication(int[][] mat1 , int r1 , int c1 , int[][] mat2 , int r2 , int c2){

        int i , j , k;

        System.out.println("\nMatrix A:");
        print(mat1, r1, c1);
        System.out.println("\nMatrix B:");
        print(mat2, r2, c2);

        if(r2 != c1){
            System.out.println("\nMultiplication is not possible");
            return;
        }

        int[][] newmat = new int[r1][c2];

        for(i=0 ; i<r1 ; i++){
            for(j=0 ; j<c2 ; j++){
                for(k=0 ; k<r2 ; k++){

                    newmat[i][j] += mat1[i][k] * mat2[k][j];

                }
            }
        }

        System.out.println("\n Resultant Matrix : ");
        print(newmat, r1, c2);

    }

    public static void main(String[] args) {
        
        int[][] matA = { {1,1,1},{2,2,2},{3,3,3},{4,4,4} };
        int[][] matB = { {1,1,1,1},{2,2,2,2},{3,3,3,3} };
        int r1=4 , c1=3 , r2=3 , c2=4;        
        
        multiplication(matA, r1, c1, matB, r2, c2);

    }
    
}
