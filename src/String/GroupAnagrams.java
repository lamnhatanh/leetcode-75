package String;

import java.util.*;

public class GroupAnagrams {
//    Input: strs = ["eat","tea","tan","ate","nat","bat"]
//    Output: [["bat"],["nat","tan"],["ate","eat","tea"]]
    public static void main(String[] args) {
        String[] strs = {"eat","tea","tan","ate","nat","bat"};
        System.out.println(optimalSolution(strs));
        System.out.println(groupAnagrams(strs));
    }

    public static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            String key = "";
            int[] hash = new int[26];

            for (int j = 0; j < strs[i].length(); j++) {
                hash[strs[i].charAt(j) - 'a']++;
            }

            for (int k = 0; k < hash.length; k++) {
                key += "#" + hash[k];
            }

            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(strs[i]);
        }
        res.addAll(hm.values());

        return res;
    }

    public static List<List<String>> optimalSolution(String[] strs) {
        List<List<String>> res = new ArrayList<>();
        Map<String, List<String>> hm = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] c = strs[i].toCharArray();
            Arrays.sort(c);
            String key = String.valueOf(c);
            if (!hm.containsKey(key)) {
                hm.put(key, new ArrayList<>());
            }
            hm.get(key).add(strs[i]);
        }
        res.addAll(hm.values());
        return res;
    }
}
