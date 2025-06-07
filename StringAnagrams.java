import java.util.HashMap;

public class StringAnagrams {
    
    static int anagrams(String s1, String s2){

        if(s1.length() != s2.length()){
            return 0;
        }

        HashMap<Character , Integer> map = new HashMap<>();
        for(char c : s1.toCharArray()){
            map.put(c, map.getOrDefault(c, 0)+1);
        }
        for(char c : s2.toCharArray()){
            if(!map.containsKey(c) || map.get(c) == 0)
            return 0;

            map.put(c, map.get(c)-1);
        }
        return 1;
    }

    public static void main(String[] args) {
        String s1="listen";
        String s2="silent";

        if(anagrams(s1, s2) == 1){
            System.out.println("They are anagrams");
        }
        else{
            System.out.println("They are not anagrams");
        }
    }
}

