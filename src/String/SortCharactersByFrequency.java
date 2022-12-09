package String;

import java.util.*;

public class SortCharactersByFrequency {
    public static void main(String[] args) {
//        Input: s = "tree"
//        Output: "eert"
//        Explanation: 'e' appears twice while 'r' and 't' both appear once.
//                So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

        System.out.println(frequencySort("tree"));
    }

    public static String frequencySort(String s) {
        String ans = "";
        Map<Character, Integer> hm = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            hm.put(s.charAt(i), hm.getOrDefault(s.charAt(i), 0) + 1);
        }

        List<Character> characters = new ArrayList<>(hm.keySet());
        Collections.sort(characters, (n1, n2) -> hm.get(n2) - hm.get(n1));


        System.out.println(hm);
        System.out.println(characters);

        for (char c : characters) {
            int copies = hm.get(c);
            for (int i = 0; i < copies; i++) {
                ans += c;
            }
        }

        return ans;
    }
}
