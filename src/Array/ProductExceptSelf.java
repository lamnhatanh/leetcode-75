package Array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ProductExceptSelf {
    public static void main(String[] args) {
//        Input: nums = [1,2,3,4]
//        Output: [24,12,8,6]
        int[] nums = new int[] {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(nums)));
        //System.out.println(Arrays.toString(productExceptSelfOptimalSolution(nums)));
    }

    public static int[] productExceptSelf(int[] nums) {
        int[] output = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            int product = 1;
            for (int j = 0; j < nums.length; j++) {
                if (j == i) {
                    continue;
                }
                product *= nums[j];
            }
            output[i] = product;
        }

        return output;
    }

    public static int[] productExceptSelfOptimalSolution(int[] nums) {
        int length = nums.length;
        int[] L = new int[length];
        int[] R = new int[length];
        int[] output = new int[length];

        L[0] = 1;
        R[length - 1] = 1;

        for (int i = 1; i < length; i++) {
            L[i] = nums[i - 1] * L[i - 1];
        }

        for (int i = length - 2; i >= 0; i--) {
            R[i] = nums[i + 1] * R[i + 1];
        }

        for (int i = 0; i < length; i++) {
            output[i] = L[i] * R[i];
        }
        return output;
    }

}
