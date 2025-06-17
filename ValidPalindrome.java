import java.util.HashSet;

public class ValidPalindrome {

    static String ispalindrome(String str){

        HashSet <Character> str1 = new HashSet<>();

        for(int i=0 ; i<str.length() ; i++){
            str1.add(str.charAt(i));
        }

        boolean check = false;

        for(Character i : str1){
            int low = 0;
            int high = str.length()-1;
            boolean flag = true;
            for(int j=0 ; j<str.length() ; j++){
                if(str.charAt(low) == str.charAt(high)){
                   low++;
                   high--;
                }
                else{
                    if(str.charAt(low) == i){
                        low++;
                    }
                    else if(str.charAt(high) == i){
                        high--;
                    }
                    else{
                        flag = false;
                        break;
                    }
                }
            }
            if(flag == true){
                check = true;
                break;
            }
        }

        if(check)
        return "Yes , it is valid palindrome";
        else
        return "No , it is not a valid palindrome";
    }

    public static void main(String[] args) {
        
        String str = "abac";

        System.out.println(ispalindrome(str));
    }
    
}
