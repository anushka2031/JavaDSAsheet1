import java.util.Scanner;

public class SpiralTraversal {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows:");
        int m = sc.nextInt();
        System.out.println("Enter the no. of columns:");
        int n = sc.nextInt();
        int[][] arr = new int[m][n];

        System.out.println("Enter matrix of your choice:");
        for(int i=0 ; i<m ; i++){
            for(int j=0 ; j<n ; j++){

                arr[i][j] = sc.nextInt();

            }
        }

        int top = 0 ;
        int bottom = m-1;
        int left = 0;
        int right = n-1;

        System.out.println("The spiral traversal of the given 2D matrix is ");

        while (top <= bottom && left <= right) {
            
            for(int i=left ; i<=right ; i++){
                System.out.print(arr[top][i] + " ");
            }
            top++;

            for(int i=top ; i<=bottom ; i++){
                System.out.print(arr[i][right] + " ");
            }
            right--;

            if(top <= bottom){
                for(int i=right ; i>=left ; i--){
                    System.out.print(arr[bottom][i] + " ");
                }
                bottom--;
            }

            if(left <= right){
                for(int i=bottom ; i>=top ; i--){
                    System.out.print(arr[i][left] + " ");
                }
                left++;
            }
            
        }
    }
    
}
