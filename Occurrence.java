
public class Occurrence {

    static void occurrence(int[] arr , int x){

        int count=0;

        System.out.println("The given array is ");
        for(int i=0 ; i<arr.length ; i++){
            System.out.print(arr[i] + " ");
        } System.out.println();

        for(int i=0 ; i<arr.length ; i++){
            if(arr[i] ==  x){
                count++;
            }
        }
        System.out.println("The element "+ x + " occured " + count + " times.");
    }

    public static void main(String[] args) {
        
        int[] arr = {1,2,3,4,2,5,3,6,2,7,2,8,2,2,9,0};
        int x=2; // element whoose occurrence is to find.

        occurrence(arr, x);
    }
}