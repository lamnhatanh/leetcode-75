package Array;

import java.util.HashSet;
import java.util.Set;

public class HappyNumber {
//    Input: n = 19
//    Output: true
//    Explanation:
//    12 + 92 = 82
//    82 + 22 = 68
//    62 + 82 = 100
//    12 + 02 + 02 = 1
    public static void main(String[] args) {
        System.out.println(isHappy(19));
    }

    public static boolean isHappy(int n) {
        Set<Integer> hs = new HashSet<>();
        while (hs.add(n)) {
            int total = 0;
            while (n != 0) {
                int digit = n % 10;
                n /= 10;
                total += Math.pow(digit, 2);
            }

            if (total == 1) return true;

            n = total;
        }

        return false;
    }
}
