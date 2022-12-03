package String;

import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abcbad"));
    }
    public static int lengthOfLongestSubstring(String s) {
//         int longestSubstring = 0;
//         Map<Character, Integer> hm = new HashMap<>();
//         for (int i = 0; i < s.length(); i++) {
//             // Map<Character, Integer> hm = new HashMap<>();
//             for (int j = i; j < s.length(); j++) {
//                 if (hm.containsKey(s.charAt(j))) {
//                     break;
//                 } else {
//                     hm.put(s.charAt(j), 1);
//                 }
//             }
//             longestSubstring = Math.max(longestSubstring, hm.size());
//         }

//         return longestSubstring;
        // abcbad

        Set<Character> hs = new HashSet<>();

        int left_pointer = 0;
        int right_pointer = 0;
        int maxLength = 0;

        while (right_pointer < s.length()) {
            if (!hs.contains(s.charAt(right_pointer))) {
                hs.add(s.charAt(right_pointer));
                right_pointer++;
                maxLength = Math.max(hs.size(), maxLength);
            } else {
                hs.remove(s.charAt(left_pointer));
                left_pointer++;
            }
        }

        return maxLength;
    }
}
