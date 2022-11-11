public class Like17 {
    class Solution{
        public static String[] capitalize(String s){

            StringBuilder builder1 = new StringBuilder();
            StringBuilder builder2 = new StringBuilder();

            for(int i=0; i<s.length(); i++)
            {
                String letter = s.substring(i, i+1);

                if (i % 2 == 1) {
                    // Even
                    builder1.append(letter.toUpperCase());
                    builder2.append(letter);
                } else {
                    // Odd
                    builder1.append(letter);
                    builder2.append(letter.toUpperCase());
                }
            }
            return new String[] { builder2.toString(), builder1.toString()};
        }
    }
}
