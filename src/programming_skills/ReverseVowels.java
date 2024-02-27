package programming_skills;

import java.util.Arrays;

public class ReverseVowels {
    public static void main(String[] args) {
        System.out.println(reverseVowels("hello"));
    }

    public static String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int start = 0, end = chars.length - 1;

        while (start < end) {
            while (start < chars.length && !isVowel(chars[start])) start++;
            while (end >= 0 && !isVowel(chars[end])) end--;

            if (start < end) {
                char c = chars[start];
                chars[start] = chars[end];
                chars[end] = c;

                end--;
                start++;
            }
        }

        return String.valueOf(chars);
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }
}
