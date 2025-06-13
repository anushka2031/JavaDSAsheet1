public class StringRemoveDuplicate {

    public static void main(String[] args) {
        
        String str="aaabdbbcsse";
        String str1="";
        for(int i=0;i<str.length();i++){
            char c=str.charAt(i);
            if(str1.indexOf(c) == -1){
                str1+=c; 
            }
        }
        System.out.println("After the removal of duplicates the new string is " + str1);

    }
}