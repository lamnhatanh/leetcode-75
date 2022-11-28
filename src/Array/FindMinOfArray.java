package Array;

public class FindMinOfArray {
    public static int findMin(int[] nums) {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < nums.length; i++) {
            min = Math.min(min, nums[i]);
        }
        return min;
    }

    public static void main(String[] args) {
//        Input: nums = [3,4,5,1,2]
//        Output: 1
//        Explanation: The original array was [1,2,3,4,5] rotated 3 times.
        System.out.println(findMin(new int[] {3,4,5,1,2}));
    }
}
