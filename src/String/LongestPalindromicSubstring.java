package String;

public class LongestPalindromicSubstring {
    public static void main(String[] args) {
//        Input: s = "babad"
//        Output: "bab"
//        Explanation: "aba" is also a valid answer.
        System.out.println(longestPalindrome("babad"));
        System.out.println(optimalSolution("babad"));
    }

    public static String optimalSolution(String s) {
        // Expand from the middle way
        String res = "";
        int maxLength = 0;

        for (int i = 0; i < s.length(); i++) {
            // odd length case
            // case: racecar (only 'e' in the middle)
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                maxLength = Math.max(maxLength, right - left + 1);
                if (maxLength > res.length()) {
                    res = s.substring(left, right + 1);
                }
                left--;
                right++;
            }

            // even length case
            // case: aabbaa (two 'bb' in the middle)
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                maxLength = Math.max(maxLength, right - left + 1);
                if (maxLength > res.length()) {
                    res = s.substring(left, right + 1);
                }
                left--;
                right++;
            }
        }

        return res;
    }
    public static String longestPalindrome(String s) {
        int maxLength = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);
                if (isPalindrome(str) && str.length() >= maxLength) {
                    maxLength = str.length();
                    ans = str;
                }
            }
        }
        return ans;
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) return false;
        }
        return true;
    }
}
