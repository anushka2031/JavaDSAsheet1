public class DuplicateNos {

    static void duplicate(int[] arr){

        /* finds duplicate elements in given array */
        System.out.println("Duplicate elements are:");
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i] == arr[j]){
                    System.out.println(arr[i]);
                }
            }
        }
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,1,3,2,4,3,5,6,4};
        System.out.println("Array :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        duplicate(arr);

    }
}