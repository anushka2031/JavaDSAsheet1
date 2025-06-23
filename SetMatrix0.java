public class SetMatrix0 {

    static void setmatrix(int[][] mat){

        int n=mat.length;
        int m=mat[0].length;

        int[] rows = new int[n];
        int[] cols = new int[m];

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){

                if(mat[i][j] == 0){

                    rows[i] = 1;
                    cols[j] = 1;

                }
            }
        }

        for(int i=0 ; i<n ; i++){
            for(int j=0 ; j<m ; j++){

                if(rows[i] == 1 || cols[j] == 1){
                    mat[i][j] = 0;
                }

            }
        }

    }

    public static void main(String[] args) {
        
        int[][] mat = { {1,1,1},{2,0,4},{3,3,3} };
        System.out.println("Original Matrix:");
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        setmatrix(mat);
        System.out.println("New Matrix:");
        for(int i=0 ; i<mat.length ; i++){
            for(int j=0 ; j<mat[0].length ; j++){
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }
    }
}