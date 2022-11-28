package Array;

public class MaxProductSubArray {
    public static void main(String[] args) {
//        Input: nums = [2,3,-2,4]
//        Output: 6
//        Explanation: [2,3] has the largest product 6.
        System.out.println(maxProduct(new int[] {2,3,-2,4}));
    }

    public static int maxProduct(int[] nums) {
        int maxProduct = nums[0];

        for (int i = 0; i < nums.length; i++) {
            int currentProduct = 1;
            for (int j = i; j < nums.length; j++) {
                currentProduct *= nums[j];
                maxProduct = Math.max(maxProduct, currentProduct);
            }
        }

        return maxProduct;
    }
}
