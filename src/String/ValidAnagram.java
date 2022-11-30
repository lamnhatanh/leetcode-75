package String;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String[] args) {
//        Input: s = "anagram", t = "nagaram"
//        Output: true
        System.out.println(isAnagram("anagram", "nagaram"));
    }

    public static boolean isAnagram(String s, String t) {
        Map<Character, Integer> hm1 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            hm1.put(s.charAt(i), hm1.getOrDefault(s.charAt(i), 0) + 1);
        }

        Map<Character, Integer> hm2 = new HashMap<>();
        for (int i = 0; i < t.length(); i++) {
            hm2.put(t.charAt(i), hm2.getOrDefault(t.charAt(i), 0) + 1);
        }

        return (hm1.equals(hm2));
    }
}
