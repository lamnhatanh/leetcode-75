package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ThreeSum {
    public static void main(String[] args) {
//        Input: nums = [-1,0,1,2,-1,-4]
//        Output: [[-1,-1,2],[-1,0,1]]
        System.out.println(threeSum(new int[] {-1,0,1,2,-1,-4}));
    }

    public static List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> allTriplet = new ArrayList<>();
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            int L = i + 1;
            int R = nums.length - 1;

            if ((i == 0) || (nums[i] != nums[i-1])) {
                while (L < R) {
                    int sum = nums[i] + nums[L] + nums[R];
                    if (sum == 0) {
                        List<Integer> triplet = new ArrayList<>();
                        triplet.add(nums[i]);
                        triplet.add(nums[L]);
                        triplet.add(nums[R]);

                        allTriplet.add(triplet);

                        // check duplicate
                        while ((L < R) && (nums[L] == nums[L+1])) L++;
                        while ((L < R) && (nums[R] == nums[R-1])) R--;

                        L++;
                        R--;

                    } else if (sum < 0) {
                        L++;
                    } else {
                        R--;
                    }
                }
            }
        }

        return allTriplet;
    }
}
