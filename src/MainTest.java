import java.util.*;

public class MainTest {
    public static void main(String[] args) {
//         Input: nums = [2,3,-2,4]
//Output: 6
//Explanation: [2,3] has the largest product 6.
        System.out.println(reverseVowels("hello"));
    }

    public  static String reverseVowels(String s) {
        String ans = "";
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            if (isVowel(c)) {
                stack.push(c);
            }
        }

        for (char c : s.toCharArray()) {
            if (!isVowel(c)) {
                ans += c;
            } else {
                ans += stack.pop();
            }
        }

        return ans;
    }

    public static boolean isVowel(char c) {
        return c == 'a' || c == 'i' || c == 'e' || c == 'o' || c == 'u'
                || c == 'A' || c == 'I' || c == 'E' || c == 'O' || c == 'U';
    }















}
