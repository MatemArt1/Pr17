public class Main {
    /*
    Alternate capitalization
    Given a string, capitalize the letters that occupy even indexes and odd indexes separately,
     and return as shown below. Index 0 will be considered even.

For example, capitalize("abcdef") = ['AbCdEf', 'aBcDeF']. See test cases for more examples.

The input will be a lowercase string with no spaces.
     */
    class Solution{
        public static String[] capitalize(String s){
            // Gorillaz - Do Ya Thing (2010)
            String s1 = "";
            String s2 = "";
            for (int i = 0; i < s.length(); i++)
            {
                if (i%2 ==0)
                {
                    char a = s.charAt(i);
                    s2 = s2 + a;
                    String a1 = String.valueOf(a);
                    s1 = s1 + a1.toUpperCase();
                }
                else
                {
                    char b = s.charAt(i);
                    s1 = s1 + b;
                    String b1 = String.valueOf(b);
                    s2 = s2 + b1.toUpperCase();
                }
            }
            String[] S = new String[] {s1, s2};
            return S;
        }
    }
    public static void main(String[] args) {

    }
}