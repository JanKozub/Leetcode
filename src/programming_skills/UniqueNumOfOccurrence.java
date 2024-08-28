package programming_skills;

import java.util.*;

public class UniqueNumOfOccurrence {
    public boolean uniqueOccurrences(int[] arr) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int j : arr) {
            map.put(j, map.getOrDefault(j, 0) + 1);
        }

        if (map.keySet().size() == 1) return true;

        Set<Integer> set = new HashSet<>();

        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (set.contains(entry.getValue())) return false;

            set.add(entry.getValue());
        }
        return true;
    }
}
