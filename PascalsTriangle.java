import java.util.Scanner;

public class PascalsTriangle {

    // Pascal's triangle is a triangular array of numbers where each number is the sum of the two numbers directly above it .The triangle begins with a single '1' at the top and edges of triangle are always '1'.

    static int factorial(int n){

        if(n == 0){
            return 1;
        }

        return n*factorial(n-1);
    }

    static int nCr(int n , int r){

        return (factorial(n)/(factorial(n-r)*factorial(r)));

    }

    static void printPascalsTriangle(int rows){

        for(int i=0 ; i<=rows ; i++){
            for(int j=0 ; j<rows-i ; j++){
                System.out.print(" ");
            }
            for(int j=0 ; j<=i ; j++){
               System.out.print(" " + nCr(i, j));
            }
            System.out.println();
        }
        
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the no. of rows :");
        int r = sc.nextInt();
        System.out.println("Pascal's Triangle :");
        printPascalsTriangle(r);

    }
    
}
