public class Permutations {

    // Function to print all the permutations of str
    static void permutation(String str, String ans)
    {

        // If string is empty
        if (str.length() == 0) {
            System.out.print(ans + " ");
            return;
        }

        for (int i = 0; i < str.length(); i++) {

            // ith character of str
            char ch = str.charAt(i);

            // Rest of the string after excluding
            // the ith character
            String ros = str.substring(0, i) +
                        str.substring(i + 1);

            // Recursive call
            permutation(ros, ans + ch);
        }
    }

    // Driver code
    public static void main(String[] args)
    {
        String s = "abbc";
        System.out.println("The all possible permutations of given string ");
        permutation(s, "");
    }
   
}
