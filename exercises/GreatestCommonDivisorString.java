package exercises;

public class GreatestCommonDivisorString {
    public static void main(String[] args) {
        String word1 = "ABCABC";
        String word2 = "ABC";

        System.out.println(solution(word1, word2));
    }

    public static String solution(String str1, String str2) {
        if (str1.length() < str2.length()) {
            return solution(str2, str1);
        }

        if (str1.equals(str2)) {
            return str1;
        }

        if(str1.startsWith(str2)) {
            return solution(str1.substring(str2.length()), str2);
        }

        return "";
    }
}
