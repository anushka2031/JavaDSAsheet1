public class MedianRowSortedMatrix {
    
    public static int median(int[][] mat , int r , int c){

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for(int i=0 ; i<r ; i++){
            min = Math.min(min, mat[i][0]);
            max = Math.max(max, mat[i][c-1]);
        }

        int d = (r*c)/2+1;

        while (min < max) {
            int mid = min + (max-min)/2;
            int count = 0;

            for(int i=0 ; i<r ; i++){
                count += Count(mat[i], mid);
            }

            if(count < d){
                min = mid+1;
            }
            else{
                max = mid;
            }
        }

        return min;
    }

    static int Count(int[] row , int target){

        int low=0;
        int high=row.length-1;
        while (low <= high) {
            int mid = low + (high-low)/2;
            if ((row[mid] <= target)) {
                low = mid+1;
            }
            else{
                high = mid-1;
            }
        }

        return low;
    }

    public static void main(String[] args) {
        
        int[][] matrix = {{1,3,5} , {2,6,9} , {3,6,9}};
        int r=matrix.length;
        int c=matrix[0].length;

        System.out.println("The median is: " + median(matrix, r, c));
    }
}
