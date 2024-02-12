package programming_skills;

public class BuddyStrings {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) return false;
        if (s.length() == 1) return false;

        char[] c1 = s.toCharArray();


        if (s.equals(goal)) return lettersToSwapExist(c1);

        int counter = 0;
        char[] chars = new char[]{0,0};
        char[] chars2 = new char[]{0,0};
        char[] c2 = goal.toCharArray();

        for (int i = 0; i < c1.length; i++) {
            if (c1[i] != c2[i]) {
                chars[chars[0] == 0 ? 0 : 1] = c1[i];
                chars2[chars2[0] == 0 ? 0 : 1] = c2[i];
                counter++;
            }

            if (counter > 2) return false;
        }

        if (counter == 1) return false;
        if (counter == 2) return chars[0] == chars2[1] && chars[1] == chars2[0];

        return false;
    }

    private boolean lettersToSwapExist(char[] sArray) {
        for(int i = 0; i < sArray.length; i++) {
            for(int j = 0; j < sArray.length; j++) {
                if (i != j && sArray[i] == sArray[j]) {
                    return true;
                }
            }
        }
        return false;
    }
}
