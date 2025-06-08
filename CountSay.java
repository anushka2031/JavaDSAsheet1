public class CountSay {

    static String countsay(int n){
        /*The count and say sequence is a sequence of digit and strings 
         * defined by recursive formula : countsay(n-1)
         */
        if (n==1) {
            return "1";
        }

        String str = countsay(n-1);
        StringBuilder str1 = new StringBuilder();

        int i=0;
        while(i<str.length()){
            int count =1;
            while( i+1<str.length() && str.charAt(i) == str.charAt(i+1)){
                i++;
                count++;
            }
            str1.append(count).append(str.charAt(i));
            i++;
        }
        return str1.toString();
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println("n = "+n);
        System.out.println("The sequence of count and say is "+countsay(n));
    }
    
}
