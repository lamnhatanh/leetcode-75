package String;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {
    public static void main(String[] args) {
//        Input: n = 3
//        Output: ["((()))","(()())","(())()","()(())","()()()"]
        System.out.println(generateParenthesis(3));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> ans = new ArrayList<>();

        backtrack(ans, "", 0, 0, n);

        return ans;
    }

    private static void backtrack(List<String> ans, String current_string, int open, int close, int max) {
        if (current_string.length() == max * 2) {
            ans.add(current_string);
            return;
        }

        if (open < max) {
            backtrack(ans, current_string + "(", open + 1, close, max);
        }

        if (close < open) {
            backtrack(ans, current_string + ")", open, close + 1, max);
        }
    }
}
