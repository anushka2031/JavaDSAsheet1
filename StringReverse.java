public class StringReverse {

    public static void main(String[] args) {

        String str = "available";

        System.out.println("The reversed string is ");

        for(int i=str.length()-1;i>=0;i--){
             System.out.print(str.charAt(i));
        }
    }
}