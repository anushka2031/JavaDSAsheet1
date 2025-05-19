
//for user input
//import java.util.Scanner;

public class reverseArray {

    static void Reverse(int[] arr){

        int temp;
        int l=0;
        int h=arr.length-1;
        for(int i=0;i<arr.length;i++){

            if(l<h){
                temp=arr[h];
                arr[h]=arr[l];
                arr[l]=temp;
            }

            l++;
            h--;

        }
        for (int i=0;i<arr.length;i++) {
            System.out.println(arr[i]);
        }
    }

    public static void main(String[] args) {

        
        int[] arr={1,2,3,4,5};
        
        //user input
        // Scanner in= new Scanner(System.in);
        // System.out.println("Enter size of array:");
        // int n= in.nextInt();
        // int[] arr=new int[n];
        // System.out.println("Enter elements of array:");

        // for(int i=0;i<n;i++){
        //     arr[i]=in.nextInt();
        // }

        System.out.println("original array:");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

        System.out.println("The reversed elements are");
        
        Reverse(arr);

    }
    
}
