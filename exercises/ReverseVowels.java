package exercises;

public class ReverseVowels {
    public static void main(String[] args) {

        System.out.println(reverseVowels("leetcode"));
    }

    public static String reverseVowels(String s) {
        int j = -1;
        String vowels = "";
        char[] str = s.toCharArray();

        for (int i = 0; i < s.length(); i++) {
            if (isVowel(str[i])) {
                j++;
                vowels += str[i];
            }
        }

        System.out.println(vowels);

        for (int i = 0; i < str.length; i++) {
            if (isVowel(str[i])) {
                str[i] = vowels.charAt(j--);
            }
        }

        return String.valueOf(str);

    }

    public static boolean isVowel(char c) {
        return (c == 'a' || c == 'A' || c == 'e'
                || c == 'E' || c == 'i' || c == 'I'
                || c == 'o' || c == 'O' || c == 'u'
                || c == 'U');
    }
}
