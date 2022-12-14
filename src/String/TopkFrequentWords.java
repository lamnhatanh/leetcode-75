package String;

import java.util.*;

public class TopkFrequentWords {
    public static void main(String[] args) {
//        Input: words = ["i","love","leetcode","i","love","coding"], k = 2
//        Output: ["i","love"]
//        Explanation: "i" and "love" are the two most frequent words.
//        Note that "i" comes before "love" due to a lower alphabetical order.
        System.out.println(topKFrequent(new String[] {"i","love","leetcode","i","love","coding"}, 3));
    }

    public static List<String> topKFrequent(String[] words, int k) {
        List<String> ans = new ArrayList<>();
        Map<String, Integer> hm = new HashMap<>();

        for (String word : words) {
            hm.put(word, hm.getOrDefault(word, 0) + 1);
        }

        Queue<String> heap = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                if (hm.get(o1) == hm.get(o2)) {
                    return o1.compareTo(o2);
                }
                return hm.get(o2) - hm.get(o1);
            }
        });

        for (String s : hm.keySet()) {
            heap.add(s);
        }

        for (int i = 0; i < k; i++) {
            ans.add(heap.poll());
        }

        return ans;
    }
}
