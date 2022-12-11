package Array;

public class ReverseInteger {
//    Input: x = 123
//    Output: 321
//
//    Input: x = -123
//    Output: -321
    public static void main(String[] args) {
        System.out.println(reverse(-123));
    }

    public static int reverse(int x) {
        long ans = 0;

        while (x != 0) {
            int digit = x % 10;
            x /= 10;
            ans = (ans * 10) + digit;
            if (ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE) {
                return 0;
            }
        }

        return (int) ans;
    }
}

