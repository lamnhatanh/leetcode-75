package Array;

public class MaxSubArray {
    public static void main(String[] args) {
//        Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
//        Output: 6
//        Explanation: [4,-1,2,1] has the largest sum = 6.

        System.out.println(maxSubArray(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
        System.out.println(maxSubArrayOptimalSolution(new int[] {-2,1,-3,4,-1,2,1,-5,4}));
    }

    public static int maxSubArray(int[] nums) {
        int maxSum =  Integer.MIN_VALUE;
        for (int i = 0; i < nums.length; i++) {
            int sum = 0;
            for (int j = i; j < nums.length; j++) {
                sum += nums[j];
                maxSum = Math.max(maxSum, sum);
            }
        }
        return maxSum;
    }

//    [-2,1,-3,4,-1,2,1,-5,4]
//        Explanation: [4,-1,2,1] has the largest sum = 6.

    public static int maxSubArrayOptimalSolution(int[] nums) {
        int max_sum = nums[0];
        int current_sum = max_sum;
        for (int i = 1; i < nums.length; i++) {
            current_sum = Math.max(current_sum + nums[i], nums[i]);
            max_sum = Math.max(max_sum, current_sum);
        }

        return max_sum;
    }
}
