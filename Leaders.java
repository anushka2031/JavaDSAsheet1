public class Leaders {
    /*Leaders is an array is an element that is strictly greater than ,
     * all the elements to its right.
     */

    static void leaders(int[] arr){

        for(int i=0;i<arr.length;i++){
            int j;
            for(j=i+1;j<arr.length;j++){

                if(arr[i]<=arr[j])
                    break;
                //breaks the loop for non leader element.
            }

            if(j == arr.length)
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {
        
        int[] arr={16,17,4,3,5,2};
        System.out.println("The leaders of the given array are");
        leaders(arr);
    }
    
}
