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
        String pattern, ts;
        int patternLength;

        for (int index = 1; index < s.length(); index++) {
            pattern = s.substring(0, index);
            patternLength = index;

            if (index + patternLength > s.length())
                continue;

            if (s.length() % patternLength != 0)
                continue;

            ts = s.substring(index, index + patternLength);
            while (index + patternLength <= s.length() && pattern.equals(ts)) {
                if (index + patternLength == s.length())
                    return true;

                index = index + patternLength;
                ts = s.substring(index, index + patternLength);
            }
        }

        return false;
    }
}