public class StringCompress {

    static void compress(String str){
        
        StringBuilder newStr = new StringBuilder();
        int count=1;
        char curr = str.charAt(0);
        /* Here the loop counts all the chars of string except the last one. */
        for(int i=1;i<str.length();i++){
            if(str.charAt(i) == str.charAt(i-1)){
                count++;
            }
        
            else{
                newStr.append(str.charAt(i-1)).append(count);
                // counts the last variable.
                curr = str.charAt(i);
                count=1;
            }
       }

        newStr.append(curr).append(count);
        System.out.println(newStr);

    }

    public static void main(String[] args) {
        
        String str="aaabbbbcc";
        System.out.println("compressed string:" );
        compress(str);
    }

}