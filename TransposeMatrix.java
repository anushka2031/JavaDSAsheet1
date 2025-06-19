public class TransposeMatrix {

    public static void main(String[] args) {
        
        int[][] arr = { {1,2,3} , {4,5,6} , {7,8,9} };
        int rows = arr.length;
        int cols = arr[0].length;

        int[][] newmatrix = new int[rows][cols];

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){
                newmatrix[j][i] = arr[i][j];
            }
        }

        System.out.println("Transpose of Matrix :");
        for(int i=0 ; i<newmatrix.length ; i++){
            for(int j=0 ; j<newmatrix.length ; j++){
                System.out.print(newmatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    

}
