package programming_skills;

/*

    Given a string s, check if it can be constructed by taking a substring of it and appending multiple copies of the substring together.



    Example 1:

    Input: s = "abab"
    Output: true
    Explanation: It is the substring "ab" twice.
    Example 2:

    Input: s = "aba"
    Output: false
    Example 3:

    Input: s = "abcabcabcabc"
    Output: true
    Explanation: It is the substring "abc" four times or the substring "abcabc" twice.


    Constraints:

    1 <= s.length <= 104
    s consists of lowercase English letters.

 */

public class RepeatingStringPattern {

    public static void main(String[] args) {
        System.out.println(repeatedSubstringPattern("abcabc"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        String pattern, newString;

        for (int currentLen = 1; currentLen <= s.length() / 2; currentLen++) {
            if (s.length() % currentLen != 0) continue;

            pattern = s.substring(0, currentLen);
            newString = pattern.repeat(s.length() / currentLen);

            if (s.equals(newString)) return true;
        }

        return false;
    }
}