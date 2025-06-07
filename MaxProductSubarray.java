public class MaxProductSubarray {

    static int max(int a, int b){
    return (a>b)?a:b;
}

static int min(int a,int b){
    return (a<b)?a:b;
}

public static int maxproduct(int[] arr){
    if(arr.length == 0){
        return 0;
    }

    /* Max , Min and res are initialized by the first 
      element of the array.
     */
    int Max = arr[0];
    int Min = arr[0];
    int res = arr[0];

    /* The loop iterates through the array , calculating
     * the new Max and Min based on the current element.
     */
    for(int i=1 ; i<arr.length ; i++){
        int curr = arr[i];
        int tempmax = max(curr, max(Max*curr, Min*curr));
        Min = min(curr, min(Max*curr, Min*curr));
        Max = tempmax;
        // the res is updated to track the overall max product.
        res = max(Max, res);
    }
    
    return res;
}

    public static void main(String[] args) {
        int[] arr = {2,3,-2,4};
        System.out.println("Elements of array :");
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
        System.out.println("The maximum subarray product is ");
        System.out.println(maxproduct(arr));
    }
}
