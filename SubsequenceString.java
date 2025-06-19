public class SubsequenceString {

    public static boolean isSubsequence (String s1 , String s2){

        int i=0; // pointer for subsequence
        int j=0; // pointer for main string

        while (i < s1.length() && j < s2.length()) {
            
            if(s1.charAt(i) == s2.charAt(j)){
                i++;
            }
            j++;

        }

        // if i reaches the end of s1 , it means s1 is a subsequence of s2
        return i == s1.length();
    }

    public static void main(String[] args) {
        
        String s1 = "ace";
        String s2 = "abcde";
       
        if( isSubsequence(s1, s2) ){
            System.out.println(" ' " + s1 + " ' is a subsequence of " + s2);
        }
        else{
            System.out.println(" ' " + s1 + " ' is NOT a subsequence of " + s2);
        }

        String s3 = "aec";
        String s4 = "acdbe";


        if( isSubsequence(s3, s4) ){
            System.out.println(" ' " + s3 + " ' is a subsequence of " + s4);
        }
        else{
            System.out.println(" ' " + s3 + " ' is NOT a subsequence of " + s4);
        }

    }
    
}
