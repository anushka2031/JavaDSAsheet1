// for user input
//import java.util.Scanner;


public class KthMaxMin {

    public static void BubbleSort(int[] arr){

        for(int i=0;i<arr.length-1;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }


    public static int KthMin(int[] arr,int k){
        
        BubbleSort(arr);// this function is used to sort the given array.
        return arr[k-1];//after sorting it will return the k-1 index which probably would be the kth smallest value of the given array.
    }


    public static int KthMax(int[] arr,int k){

        BubbleSort(arr);
        return arr[arr.length-k];//after sorting it will return the arr.lenght-k index which would be the kth largest value of the given array.
    }



    public static void main(String[] args) {

        //hardcoded input
        int[] arr={8,7,5,3,56,76,23,6,2,1};
        int k=4;

        //user input
        // Scanner in = new Scanner(System.in);
        // System.out.println("Enter the size of array:");
        // int n = in.nextInt();

        // int[] arr= new int[n];
        // System.out.println("Enter elements of array:");
        // for(int i=0;i<n;i++){
        //     arr[i]=in.nextInt();
        // }

        // System.out.println("Enter the kth index:");
        // int k = in.nextInt();

        System.out.println("The "+k+"th minimum element is "+KthMin(arr,k));
        System.out.println("The "+k+"th maximum element is "+KthMax(arr,k));
    }
}
