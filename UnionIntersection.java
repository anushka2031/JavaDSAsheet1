public class UnionIntersection {

    /*In this method we merge two arrays to find their union. */
    static void union(int[] arr1, int[] arr2){
        
        for(int i=0;i<arr1.length;i++){
            System.out.println(arr1[i]);
        }

        for(int i=0;i<arr2.length;i++){
            int j;
            for(j=0;j<arr1.length;j++){
                if(arr2[i] == arr1[j]){
                    break;
                }
            }
            if(j == arr1.length){
                System.out.println(arr2[i]);
            }
        }
    }

    /*In this method we only print the elements which are common in two arrays. */
    static void intersection(int[] arr1, int[] arr2){
        for(int i=0;i<arr1.length;i++){
            for(int j=0;j<arr2.length;j++){
                if(arr1[i] == arr2[j]){
                    System.out.println(arr1[i]);
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr1={0,1,2,3,4,5};
        int[] arr2={4,5,6,7,8,9};

        System.out.println("Union of arrays:");
        union(arr1, arr2);

        System.out.println("Intersection of arrays:");
        intersection(arr1, arr2);
    }
    
}
