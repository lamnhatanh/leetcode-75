package String;

import java.util.HashMap;
import java.util.Map;

public class LongestRepeatingCharacterReplacement {

    public static void main(String[] args) {
        System.out.println(characterReplacement("ABABBA", 2));
    }

    public static int characterReplacement(String s, int k) {
        Map<Character, Integer> hm = new HashMap<>();
        int maxLength = 0;
        int mostFreq = 0;

        int left = 0, right = 0;

        while (right < s.length()) {
            hm.put(s.charAt(right), hm.getOrDefault(s.charAt(right), 0) + 1);
            mostFreq = Math.max(mostFreq, hm.get(s.charAt(right)));

            // total current character - mostFreq
            int totalCharReplace = (right - left + 1) - mostFreq;

            if (totalCharReplace > k) {
                hm.put(s.charAt(left), hm.get(s.charAt(left)) - 1);
                left++;
            }

            // Update the maxLength
            // maxLength will be the total current character
            maxLength = Math.max(maxLength, right - left + 1);
            right++;

        }

        return maxLength;
    }
}
