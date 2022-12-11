package Array;

import java.util.Arrays;

public class MedianofTwoSortedArrays {
    public static void main(String[] args) {
//        Input: nums1 = [1,2], nums2 = [3,4]
//        Output: 2.50000
//        Explanation: merged array = [1,2,3,4] and median is (2 + 3) / 2 = 2.5.
        System.out.println(findMedianSortedArrays(new int[]{1,2}, new int[]{3,4}));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double ans = 0;
        int m = nums1.length;
        int n = nums2.length;
        int totalLength = m + n;
        int[] mergeArray = new int[totalLength];

        for (int i = 0; i < m; i++) {
            mergeArray[i] = nums1[i];
        }

        for (int i = 0; i < n; i++) {
            mergeArray[m+i] = nums2[i];
        }
        Arrays.sort(mergeArray);

        System.out.println(Arrays.toString(mergeArray));
        if (mergeArray.length % 2 == 0) {
            int index = (mergeArray.length - 1) / 2;
            ans = (double) (mergeArray[index] + mergeArray[index+1]) / 2;
        } else {
            ans = mergeArray[mergeArray.length / 2];
        }

        return ans;
    }
}
