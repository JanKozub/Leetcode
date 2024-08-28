package programming_skills;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class findDiffInArray {
    public static void main(String[] args) {
        System.out.println(findDifference(new int[]{1, 2, 3}, new int[]{2, 4, 6}));
    }

    public static List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<Integer> list1 = new ArrayList<>(), list2 = new ArrayList<>();
        HashSet<Integer> set1 = new HashSet<>(), set2 = new HashSet<>();

        for (int i : nums1) {
            set1.add(i);
        }

        for (int i : nums2) {
            set2.add(i);
        }

        for (int i : set1) {
            if (!set2.contains(i)) list1.add(i);
        }

        for (int i : set2) {
            if (!set1.contains(i)) list2.add(i);
        }

        return List.of(list1, list2);
    }
}
