public class GivenSum {

    static void pairs(int[] arr , int target){

        /*Here the loop of j iterates throughout the array 
         for the each i to find the target sum. */

        for(int i=0 ; i<arr.length ; i++){
            for(int j=0 ; j<arr.length ; j++){

                if( arr[i] + arr[j] == target){
                    System.out.println("(" + arr[i] + "," + arr[j] + ")");
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,5,6};
        int targetsum = 7;
        System.out.println("Given Array");
        for (int i=0 ; i<arr.length ; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println("Target Sum is " + targetsum);

        System.out.println("The pairs with the given target sum are ");
        pairs(arr, targetsum);
    }
}