package programming_skills;

public class MergeAlternately {

    public static void main(String[] args) {
        System.out.println(mergeAlternately("abcd", "pq"));
    }

    public static String mergeAlternately(String word1, String word2) {
        StringBuilder result = new StringBuilder();
        char[] chars1 = word1.toCharArray();
        char[] chars2 = word2.toCharArray();

        for (int i = 0; i < Math.max(chars1.length, chars2.length); i++) {
            if (i < chars1.length)
                result.append(chars1[i]);
            if (i < chars2.length)
                result.append(chars2[i]);
        }

        return result.toString();
    }
}
