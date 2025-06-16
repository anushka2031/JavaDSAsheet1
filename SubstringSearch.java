public class SubstringSearch {

    /* It involves finding occurrences of smaller string (the substring or pattern) within a larger string (the text or string). */

    public static String substring(String str , int a){

        String s = "";

        for(int i=a ; i<str.length() ; i++){
            s += str.charAt(i);
        }

        return s;
    }

    public static String substring(String str , int a , int b){

        String s = "";

        for(int i=a ; i<b ; i++){
            if(i >= str.length()){
                break;
            }
            s += str.charAt(i);
        }

        return s;
    }
    
    public static void main(String[] args) {
        
        String str = "Hello World";

        System.out.println(substring(str, 5));
        System.out.println(substring(str, 2, 7));

    }
}
