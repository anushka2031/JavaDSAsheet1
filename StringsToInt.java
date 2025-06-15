public class StringsToInt {

    public static void toint(String str){

        int res=0;
        for (int i=0 ; i<str.length() ; i++){
            char c = str.charAt(i);
            if( c >= '0' && c <= '9'){
                res = res * 10 + c -'0';
            }
            else{
                break;
            }
            
        }
        System.out.println(res);
    }

    public static void main(String[] args) {
        
        String str ="1337";
        System.out.println("Converted Integer String :");
        toint(str);
        
    }
    
}
