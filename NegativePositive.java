public class NegativePositive {
    
    static void NParray(int[] arr){

        /*In this method we iterate through array , using index l to the position of next negative num. 
        If a negative num is encountered at index then it is being swapped with the element at index l.*/

        int l=0;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
               if(i!=l){
                int temp=arr[i];
                arr[i]=arr[l];
                arr[l]=temp;
               }
               l++;
            }
        }

        System.out.println("Array after arranging");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }

    }

    /*This problem can also be stated using sorting method , that sorts the element from negative to positive .*/
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

        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }


    public static void main(String[] args) {
        int[] arr={-3,6,7,3,2,-9,-6,1,-7};
        NParray(arr);
        System.out.println("Through sorting the rearranged array is");
        BubbleSort(arr);
    }
}
