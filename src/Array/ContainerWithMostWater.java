package Array;

public class ContainerWithMostWater {
    public static int maxArea(int[] height) {
        int maxArea = 0;
        for (int i = 0; i < height.length; i++) {
            for (int j = i + 1; j < height.length; j++) {
                int currentArea = Math.min(height[i], height[j]) * (j - i);
                maxArea = Math.max(currentArea, maxArea);
            }
        }

        return maxArea;
    }

    public static int maxAreaOptimalSolution(int[] height) {
        int maxArea = 0;

        int L = 0;
        int R = height.length - 1;

        while (L < R) {
            int currentArea = Math.min(height[L], height[R]) * (R - L);
            maxArea = Math.max(maxArea, currentArea);

            if (height[L] <= height[R]) {
                L++;
            } else {
                R--;
            }
        }

        return maxArea;
    }

    public static void main(String[] args) {
//        Input: height = [1,8,6,2,5,4,8,3,7]
//        Output: 49
//        Explanation: The above vertical lines are represented by array [1,8,6,2,5,4,8,3,7]. In this case, the max area of water (blue section) the container can contain is 49.
        System.out.println(maxArea(new int[] {1,8,6,2,5,4,8,3,7}));
        System.out.println(maxAreaOptimalSolution(new int[] {1,8,6,2,5,4,8,3,7}));
    }
}
