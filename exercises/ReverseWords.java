package exercises;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ReverseWords {
    public static void main(String[] args) {

        System.out.println(reverseWords("the   sky is blue"));
    }

    public static String reverseWords(String s) {
        String[] words = s.split(" ");
        List<String> strings = new ArrayList<>();
        int count = 0;

        for (String word : words) {
            if(!word.isEmpty()) {
                strings.add(word);
                count++;
            }
        }

        Collections.reverse(strings);
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strings.size(); i++) {
            if (i != strings.size() - 1) {
                stringBuilder.append(strings.get(i)).append(" ");
            } else {
                stringBuilder.append(strings.get(i));
            }
        }

        return stringBuilder.toString();
    }

}
