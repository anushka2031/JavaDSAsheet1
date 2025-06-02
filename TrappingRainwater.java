public class TrappingRainwater {
    /* Trapping Rainwater Problem */

    static int max (int a , int b){
        /* function for finding max of two values using terniary operator. */
        return (a>=b) ? a : b ;
    }

    static int trap (int[] arr){

        int left = 0;
        int right = arr.length - 1;
        int Lmax = arr[left];
        int Rmax = arr[right];
        int water = 0; // water trapped initially is 0 . 

        while(left < right){
            //runs until left and right crosses eachother.
            if(Lmax < Rmax){
                left++;
                Lmax = max(Lmax, arr[left]);
                water += Lmax - arr[left];
            }
            else{
                right--;
                Rmax = max(Rmax, arr[right]);
                water += Rmax - arr[right];
            }
        }

        return water;
    }

    public static void main(String[] args) {
        
        int[] arr = {0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Trapped Water :");
        System.out.println(trap(arr));

    }
}