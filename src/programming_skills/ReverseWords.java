package programming_skills;

public class ReverseWords {
    public String reverseWords(String s) {
        String[] words = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i++) {
            if (!words[i].contains(" ")) sb.append(words[i]).append(" ");
        }

        return sb.substring(sb.length() - 1);
    }
}
