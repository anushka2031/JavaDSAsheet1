import java.util.Arrays;

public class LongestCommonPrefix {

/* longest common prefix refers to the sequence of charcters thst appears at
 * the beginning of all the strings in a given set of strings .
 */

    public static void Prefix( String[] str){

        Arrays.sort(str);

        String first = str[0];
        String last = str[ str.length - 1 ];
        int min = Math.min( first.length() , last.length() ); //for minimum length.

        int i=0;
        while( i<min && first.charAt(i) == last.charAt(i)){
            i++;
        }

        System.out.println( first.substring(0, i) );
    }


    public static void main(String[] args) {
        
       String[] str = { "flow" , "flower" , "flown" , "flute" };
       System.out.print("The longest common prefix is ");
       Prefix(str);

    }
    
}
