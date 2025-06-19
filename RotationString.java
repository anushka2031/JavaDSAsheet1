public class RotationString {

    public static boolean arerotation (String s1 , String s2){

        // check if s1 and s2 are equal in lenght.
        if( s1.length() != s2.length()){
            return false;
        }

        // concatenates two strings.
        String s3 = s1 + s1;
        
        // checks if s2 is a substring of concatenated string .
        return s3.contains(s2);
    }

    public static void main(String[] args) {
        
        String str1 = "ABCD";
        String str2 = "CDAB";

        if( arerotation(str1, str2) ){
            System.out.println( " ' " + str2 + " ' is the rotation of " + str1);
        }
        else{
            System.out.println(" ' " + str2 + " ' is NOT a rotation of " + str1);
        }

        String str3 = "acef";
        String str4 = "feca";

        if( arerotation(str3, str4) ){
            System.out.println(" ' " + str4 + " ' is the rotation of " + str3);
        }
        else{
            System.out.println(" ' " + str4 + " ' is NOT a rotation of " + str3);
        }
    }
    
}
