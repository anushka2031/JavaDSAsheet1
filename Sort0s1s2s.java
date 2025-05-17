// Dutch National Flag Problem

public class Sort0s1s2s {
    
    //This function swaps the values
    public static void swap(int[] arr,int i,int j){

        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;

    }

    //This function sorts the given array of 0s , 1s and 2s.
    public static void sort(int[] arr){

        int l=0;
        int h=arr.length-1;
        int mid=0;
        

        while(mid<=h){

            if(arr[mid] == 0){
                swap(arr, mid, l);
                l++;
                mid++;
            }
            else if(arr[mid] == 1){
                mid++;
            }
            else{
                swap(arr, mid, h);
                h--;
            }

        }

    }

    public static void main(String[] args) {
        
        int[] arr={0,1,2,1,0,0,1,2,1,1,2,0};

        sort(arr);

        System.out.println("The sorted array :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

}


