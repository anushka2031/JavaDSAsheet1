public class MissingNo {

    static int missing(int[] arr){
        
        /* n = to the last no of the series */
        int n = arr[arr.length - 1];
        /* formula for calculating the sum for series of natural nums */
        int s=n*(n+1)/2;
        int sum=0;
        for(int i=0;i<arr.length;i++){
            /* calulates the sum of given array of natural nums */
            sum+=arr[i];
        }
        /* finds the digit which missing in the series */
        int d=s-sum;
        return d;
    }

    public static void main(String[] args) {

        /* input array of series of natural nums */
        int[] arr = {1,2,3,4,5,7,8,9};
        System.out.println("Array :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The missing no is "+ missing(arr));
    }
}