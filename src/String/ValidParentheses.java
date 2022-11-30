package String;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParentheses {
    public static void main(String[] args) {
        System.out.println(isValid("({[})"));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();

        Map<Character, Character> hm = new HashMap<>();
        hm.put('(', ')');
        hm.put('[', ']');
        hm.put('{', '}');

        // base case
        if (s.length() % 2 != 0) return false;

        for (int i = 0; i < s.length(); i++) {
            if (hm.containsKey(s.charAt(i))) {
                stack.push(s.charAt(i));
            } else {
                // case close paren

                // ({[]})
                if ((!stack.isEmpty()) && (s.charAt(i) == hm.get(stack.peek()))) {
                    stack.pop();
                }

                // )( : stack is still zero when encountering closed paren
                // or ([}) : closed paren doesn't match opened one
                else {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
}
