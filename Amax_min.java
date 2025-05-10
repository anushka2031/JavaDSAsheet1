
public class Amax_min {
    public static void main(String[] args) {
        int[] arr={1,2,8,3,4,5,6,7,0};
        int max=0;
        int min=arr[0];
        

        for(int i=0;i<arr.length;i++){
           
            if(arr[i]>max){
            max=arr[i];
            }

            if(min>arr[i]){
                min=arr[i];
            }
            
        }
        System.out.println("maximum element is "+max);
        
        System.out.println("minimum element is "+min);
    }
}
