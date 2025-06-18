import java.util.HashMap;

public class LongestSubstring {

    static void longestsubstring(String str){
        
        HashMap <Character , Integer> map = new HashMap<>();
        int maxlenght = 0;
        int start = 0; // starting pointer for calculating the length.
        int lss = 0; // longest substring start.

        for(int i=0 ; i<str.length() ; i++){

            char curr = str.charAt(i);
            // check if the map contains the current character.
            if(map.containsKey(curr)){
                start = Math.max(start, map.get(curr) + 1);
            }

            map.put(curr , i); //updates the last character in map.
            int cl = i-start+1; //current length;
            // calculates the lenght and updates the max lenght.
            maxlenght = Math.max(maxlenght , i-start+1);

            if(cl>maxlenght){
                lss = start;
            }
            
        }
        
        System.out.print("The longest substring without a repeating character is " + str.substring(lss, lss+maxlenght));
        System.out.print( " of lenght "+ maxlenght);

    }

    public static void main(String[] args) {
        
        String str = "abcdefabcbb";
        longestsubstring(str);
       
    }
    
}
