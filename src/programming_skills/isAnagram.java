package programming_skills;

import java.util.Arrays;

public class isAnagram {
    public static void main(String[] args) {
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        char[] c1 = s.toCharArray();
        Arrays.sort(c1);

        char[] c2 = t.toCharArray();
        Arrays.sort(c2);

        return String.valueOf(c1).equals(String.valueOf(c2));
    }
}
