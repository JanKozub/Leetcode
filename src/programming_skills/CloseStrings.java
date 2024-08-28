package programming_skills;

import java.util.*;

public class CloseStrings {
    public static void main(String[] args) {
        System.out.println(closeStrings("abc", "abcdd"));
    }

    public static boolean closeStrings(String word1, String word2) {
        char[] chars1 = word1.toCharArray(), chars2 = word2.toCharArray();
        Map<Character, Integer> map1 = new HashMap<>(), map2 = new HashMap<>();
        Set<Character> keysUsed = new HashSet<>();

        for (char c : chars1) map1.put(c, map1.getOrDefault(c, 0) + 1);
        for (char c : chars2) map2.put(c, map2.getOrDefault(c, 0) + 1);

        if (!map1.keySet().containsAll(map2.keySet()) && !map2.keySet().containsAll(map1.keySet())) return false;

        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            boolean letterExists = false;
            for (Map.Entry<Character, Integer> entry2 : map2.entrySet()) {
                if (Objects.equals(entry.getValue(), entry2.getValue()) && !keysUsed.contains(entry2.getKey())) {
                    letterExists = true;
                    keysUsed.add(entry2.getKey());
                    break;
                }
            }
            if (!letterExists) return false;
        }

        return keysUsed.size() == map2.keySet().size();
    }
}
