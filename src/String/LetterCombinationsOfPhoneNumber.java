package String;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class LetterCombinationsOfPhoneNumber {
//    Input: digits = "23"
//    Output: ["ad","ae","af","bd","be","bf","cd","ce","cf"]
    public static void main(String[] args) {
        System.out.println(Solution.letterCombinations("23"));
    }

    static class Solution {
        private static Map<Character, String> hm = new HashMap<Character, String>() {{
            put('2', "abc");
            put('3', "def");
            put('4', "ghi");
            put('5', "jkl");
            put('6', "mno");
            put('7', "pqrs");
            put('8', "tuv");
            put('9', "wxyz");
        }};

        public static List<String> letterCombinations(String digits) {
            List<String> ans = new ArrayList<>();

            if (digits.length() == 0) {
                return ans;
            }
            backtrack(ans, "", 0, digits);

            return ans;
        }

        private static void backtrack(List<String> ans, String current_string, int index, String digits) {
            if (current_string.length() == digits.length()) {
                ans.add(current_string);
                return;
            }

            if (index < digits.length()) {
                String letters = hm.get(digits.charAt(index));
                for (int i = 0; i < letters.length(); i++) {
                    backtrack(ans, current_string+letters.charAt(i), index + 1, digits);
                }
            }
        }
    }


}
