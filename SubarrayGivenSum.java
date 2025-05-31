/* A subarray with a given sum is a contiguous subset of
 * elements in an array that adds upto the target sum.
 */
public class SubarrayGivenSum {
    
    static void subarraysum(int[] arr , int x){
      
        System.out.println("The subarray with the target sum " + x + " is");
        for(int i=0 ; i<arr.length ; i++){
            int sum=0;
            for(int j=i ; j<arr.length ; j++){
                    sum+=arr[j];
                    if(sum == x){
                        /* prints the subarray whoose elements sum is 
                         * equal to the target sum.
                         */
                        for(int k=i ; k<=j ; k++){
                            System.out.print(arr[k] + " ");
                        }
                        break;
                    }
            }
        }
        
    }

    public static void main(String[] args) {
        
        int[] arr = {15, 2, 4, 8, 9, 5, 10};
        int target = 23;
        System.out.println("Original Array :");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        subarraysum(arr, target);

    }
}
