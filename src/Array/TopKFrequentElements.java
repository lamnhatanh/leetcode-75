package Array;

import java.util.*;

public class TopKFrequentElements {
//    Input: nums = [1,1,1,2,2,3], k = 2
//    Output: [1,2]
    public static void main(String[] args) {
        System.out.println(Arrays.toString(topKFrequent(new int[] {1,1,1,2,2,3}, 2)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> hm = new HashMap<>();
        int[] ans = new int[k];
        for (int i = 0; i < nums.length; i++) {
            hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
        }

        // init heap 'decreasing order of hashmap value'
        Queue<Integer> heap = new PriorityQueue<>((n1, n2) -> hm.get(n2) - hm.get(n1));

        // 2. keep k top frequent elements in the heap
        // O(N log k) < O(N log N) time
        for (int n: hm.keySet()) {
            heap.add(n);
        }
        System.out.println(hm.keySet());
        System.out.println(heap);
        // 3. build an output array
        // O(k log k) time
        for(int i = 0; i < k; i++) {
            ans[i] = heap.poll();
        }

        return ans;
    }
}
