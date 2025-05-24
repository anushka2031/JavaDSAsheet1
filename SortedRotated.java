public class SortedRotated {

    static boolean sortedrotated(int[] arr){
        
        int count=0;

        /* iterates through the array and check if it is sorted or not ,
         if sorted the increament count by 1 else no increament.*/
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[(i+1)]){
                count++;
            }
        }


        /* check if the last eleement of array is greater than the 
        first element,if so then increament count by 1 else no 
        increament.*/
        if(arr[arr.length-1]>arr[0]){
            count++;
        }

        /*if the count is less than orequal to one ,
         * it means that the array is sorted or rotated,
         * so it will return true.
         */
        return (count<=1);
    }

    public static void main(String[] args) {
        int[] arr={3,4,5,1,2};

        // if boolean sortedrotated returns true print sorted and rotated.
        if(sortedrotated(arr)){
            System.out.println("The array is sorted and rotated.");
        }
        else 
        {
            System.out.println("The is not sorted and rotated.");
        }
    }
    
}
