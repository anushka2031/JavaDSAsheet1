import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class GroupAnagrams {
    
    public static List < List <String> > grpanagrams (String[] str){

        /* creating a hashmap where te key is the sorted version of each string & the value is a list of strings that are anagrams to eachother. */
        HashMap <String , List<String>> map = new HashMap<>();

        for(String i : str){

            /* iterates through the input array of strings , sorting each string & using the sorted string as a key in the hashmap. */

            char[] chars = i.toCharArray();
            Arrays.sort(chars);
            String newstr = new String(chars);

            /* if the key doesn't exist in the map , creating a new list for the key and adding the og string to the list. */
            if( !map.containsKey(newstr)){
                map.put(newstr, new ArrayList<>());
            }

            /* if the key already exists , adding the og string to the existing list. */
            map.get(newstr).add(i);
        }

        /* returning a list of map's values , which are the grps of anagrams. */
        return new ArrayList<>(map.values());
    }

    public static void main(String[] args) {
         
        String[] str = {"eat" , "tea" , "tan" , "ate" , "nat" , "bat"};

        List< List<String> >  list = grpanagrams(str);
        System.out.println("The grouped anagrams from the given list are");

        for(List<String> i : list){
            System.out.println(i);
        }

    }

}
