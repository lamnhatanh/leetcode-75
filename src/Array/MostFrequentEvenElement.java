package Array;

import java.util.*;

public class MostFrequentEvenElement {
//    Input: nums = [0,1,2,2,4,4,1]
//    Output: 2
//    Explanation:
//    The even elements are 0, 2, and 4. Of these, 2 and 4 appear the most.
//            We return the smallest one, which is 2.

    public static void main(String[] args) {
        System.out.println(mostFrequentEven(new int[] {0,1,2,2,4,4,1}));
    }

    public static int mostFrequentEven(int[] nums) {
        int ans = Integer.MAX_VALUE;
        Map<Integer, Integer> tm = new TreeMap<>();

        for (int i : nums) {
            if (i % 2 == 0) {
                tm.put(i, tm.getOrDefault(i, 0) + 1);
            }
        }
        System.out.println(tm
        );
        int maxCounter = Integer.MIN_VALUE;
        for(int key : tm.keySet()) {
            if (maxCounter < tm.get(key)) {
                maxCounter = tm.get(key);
                ans = key;
            }
        }

        if (ans == Integer.MAX_VALUE) return -1;

        return ans;
    }
}
