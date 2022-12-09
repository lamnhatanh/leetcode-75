package Array;

import java.util.PriorityQueue;

public class KthLargestElementinArray {
    public static void main(String[] args) {
//        Input: nums = [3,2,3,1,2,4,5,5,6], k = 4
//        Output: 4
//        Input: nums = [3,2,1,5,6,4], k = 2
//        Output: 5
        // example: sorted array: 1,2,2,3,3,4,5,5,6 k=4  => output: 4
        System.out.println(findKthLargest(new int[] {3,2,3,1,2,4,5,5,6}, 4));
    }

    public static int findKthLargest(int[] nums, int k) {
        // init heap 'increasing order'
        PriorityQueue<Integer> heap =
                new PriorityQueue<Integer>((n1, n2) -> n1 - n2);

        // keep k largest elements in the heap
        for (int n: nums) {
            heap.add(n);
            if (heap.size() > k)
                heap.poll();
        }
        // System.out.println(heap.poll());
        // while (!heap.isEmpty()) {
        //     System.out.println(heap.poll());
        // }
        // output
        return heap.poll();
    }


    // class Solution {
//     public int findKthLargest(int[] nums, int k) {
//         int ans = Integer.MIN_VALUE;
//         Arrays.sort(nums);
//         System.out.println(Arrays.toString(nums));
//         ans = nums[nums.length - k];
//         return ans;
//     }
// }
}
