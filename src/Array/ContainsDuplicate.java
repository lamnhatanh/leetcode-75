package Array;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
//        Input: nums = [1,2,3,1]
//        Output: true
//        Input: nums = [1,2,3,4]
//        Output: false
        System.out.println(containsDuplicateHashMapSolution(new int[] {1,2,3,4}));
    }

    public static boolean containsDuplicate(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Best optimal way using hashmap
    public static boolean containsDuplicateHashMapSolution(int[] nums) {
        Map<Integer, String> hm = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hm.containsKey(nums[i])) {
                return true;
            }
            hm.put(nums[i], "Filled");
        }
        return false;
    }

    public static boolean containsDuplicateHashSetSolution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int x: nums) {
            if (set.contains(x)) return true;
            set.add(x);
        }
        return false;
    }
}
