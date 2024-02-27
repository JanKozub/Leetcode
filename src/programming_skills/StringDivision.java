package programming_skills;

public class StringDivision {
    public static void main(String[] args) {
        System.out.println(gcdOfStrings("ABCDEF", "ABC"));
        //System.out.println(canBeDivided("ABAB".toCharArray(), "AB".toCharArray()));
    }

    public static String gcdOfStrings(String str1, String str2) {
        char[] c1 = str1.toCharArray();
        char[] c2 = str2.toCharArray();

        for (int i = Math.min(c1.length, c2.length); i > 0; i--) {
            char[] pattern = str1.substring(0, i).toCharArray();

            if (canBeDivided(c1, pattern) && canBeDivided(c2, pattern)) {
                return String.valueOf(pattern);
            }
        }

        return "";
    }

    public static boolean canBeDivided(char[] string, char[] pattern) {
        if (string.length % pattern.length != 0) return false;

        int pc = 0;
        for (int i = 0; i < string.length / pattern; i++) {
            if (i != pattern[pc]) return false;

            pc++;
            if (pc > pattern.length - 1) pc = 0;
        }

        return true;
    }
}
