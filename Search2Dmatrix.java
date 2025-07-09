public class Search2Dmatrix {

    static void search(int[][] mat , int target){

        int found = 0;
        int n = mat.length;
        if(n == 0){
            return ;
        }
        int m = mat[0].length;
        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){
                if(mat[i][j] == target){
                    found = 1;
                }
            }
        }

        if(found == 1){
            System.out.println("The target element " + target + " is found in the given matrix.");
        }
        else{
            System.out.println("The target element " + target + " is NOT found in the given matrix.");
        }

    }

    public static void main(String[] args) {
        
        int[][] matrix = {{1,2,3,4} , {5,6,7,8} , {9,10,11,12}};
        int target = 7;
        search(matrix, target);

    }
    
}
