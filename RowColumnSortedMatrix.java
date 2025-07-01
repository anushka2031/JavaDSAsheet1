public class RowColumnSortedMatrix {

    public static int searchmatrix(int[][] matrix , int target){
        
        int row = 0;
        int col = matrix[0].length-1;
        
        while (row < matrix.length && col >= 0) {
            if(target == matrix[row][col]){
                return 1;
            }
            else if(target > matrix[row][col]){
                row++;
            }
            else{
                col--;
            }
        }

        return 0;

    }

    public static void main(String[] args) {
        
        int[][] matrix = { {3,30,38} , {20,52,54} , {35,60,69} };
        int x = 35;

        if(searchmatrix(matrix, x) == 1){
            System.out.println("The target element " + x + " is found in the given matrix.");
        }
        else{
            System.out.println("The target element " + x + " is NOT found in the given matrix.");
        }
    }
    
}
