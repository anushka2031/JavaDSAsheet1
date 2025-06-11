import java.util.Arrays;
public class Merge {
    public static void merge(int[] arr1, int[] arr2) {
        int n = arr1.length;
        int m = arr2.length;

        int i = n-1 ;
        int j = 0 ;

        while(i>=0 && j<m){
            if(arr1[i]>arr2[j]){
                int temp = arr1[i];
                arr1[i]=arr2[j];
                arr2[j]=temp;
            }
            i--;
            j++;
            }
            Arrays.sort(arr1);
            Arrays.sort(arr2);
    }
    public static void main(String[] args) {
            int[] arr1 = {1,3,6,8,9,18};
            int[] arr2 ={0,2,4,7};

            merge(arr1,arr2);
            System.out.println("Merged arr1:"+Arrays.toString(arr1));
            System.out.println("Merged arr2:"+Arrays.toString(arr2));
    }
        
}