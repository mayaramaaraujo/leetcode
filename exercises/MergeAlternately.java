package exercises;

public class MergeAlternately {
    public static void main(String[] args) {
        String word1 = "abc";
        String word2 = "pqr";

        System.out.println(mergeAlternately(word1, word2));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder builder = new StringBuilder();
        String newString = "";

        for(int i = 0; i < word1.length() + word2.length(); i++) {
            if (i < word1.length()) {
                builder.append(word1.charAt(i));
            }

            if (i < word2.length()) {
                builder.append(word2.charAt(i));
            }
        }

        newString = builder.toString();
        return newString;
    }
}
