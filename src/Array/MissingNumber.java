package Array;

import java.util.HashSet;
import java.util.Set;

public class MissingNumber {

    public static void main(String[] args) {
//        Input: nums = [9,6,4,2,3,5,7,0,1]
//        Output: 8
//        Explanation: n = 9 since there are 9 numbers,
//        so all numbers are in the range [0,9]. 8 is the missing number in the range since it does not appear in nums.
        System.out.println(missingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
    }

    public static int missingNumber(int[] nums) {
        // Faster way using sum
         int sum = 0;
         for (int i = 0; i <= nums.length; i++) {
             sum += i;
             if (i != nums.length) {
                 sum -= nums[i];
             }
         }
         return sum;

         // Using hashset
//        Set<Integer> hs = new HashSet<>();
//        for (int i = 0; i < nums.length; i++) {
//            hs.add(nums[i]);
//        }
//        for (int i = 0; i <= nums.length; i++) {
//            if (!hs.contains(i)) {
//                return i;
//            }
//        }
//
//        return -1;
    }
}
