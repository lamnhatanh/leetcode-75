package String;

public class PalindromicSubstrings {
    public static void main(String[] args) {
//        Input: s = "aaa"
//        Output: 6
//        Explanation: Six palindromic strings: "a", "a", "a", "aa", "aa", "aaa".
        //System.out.println(countSubstrings("aabbaa"));
        System.out.println(optimalSolution("aabbaa"));
    }

    public static int optimalSolution(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            // odd case: abcba => total: 7
            int left = i, right = i;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                //System.out.println(s.substring(left, right + 1));
                counter++;
                left--;
                right++;
            }

            // even case: aabbaa => total: 11
            // un-comment the print to understand
            // the even case that expand to middle
            left = i;
            right = i + 1;
            while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right)) {
                System.out.println(s.substring(left, right + 1));
                counter++;
                left--;
                right++;
            }
        }

        return counter;
    }
    public static int countSubstrings(String s) {
        int counter = 0;

        for (int i = 0; i < s.length(); i++) {
            String str = "";
            for (int j = i; j < s.length(); j++) {
                str += s.charAt(j);
                if (isPalindrome(str)) {
                    System.out.println(str);
                    counter++;
                }
            }
        }

        return counter;
    }

    private static boolean isPalindrome(String s) {
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
        }
        return true;
    }
}
