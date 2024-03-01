package programming_skills;

public class IsSubsequence {

    public static void main(String[] args) {

    }

    public boolean isSubsequence(String s, String t) {
        char[] sc = s.toCharArray();
        char[] tc = t.toCharArray();
        int idx = 0;
        int counter = 0;

        for (int i = 0; i < sc.length; i++) {
            if (sc[i] == tc[idx]) {
                counter++;
                idx++;
            }
        }

        return counter == tc.length;
    }
}
