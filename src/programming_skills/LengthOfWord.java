package programming_skills;

public class LengthOfWord {

    public int lengthOfLastWord(String s) {
        char[] chars = s.toCharArray();
        int counter = 0;
        boolean start = chars[chars.length - 1] != ' ';

        for (int i = chars.length - 1; i >= 0; i--) {
            if (chars[i] == ' ') {
                if (!start) {
                    continue;
                } else {
                    return counter;
                }
            } else {
                start = true;
            }
            counter++;
        }

        return 0;
    }
}
