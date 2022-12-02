package String;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        s = s.toLowerCase();
        int left = 0, right = s.length() - 1;

//         while (left < right) {
//             // case ".," so we have to set condition left < right in while loop
//             while (left < right && !Character.isLetterOrDigit(s.charAt(left))) {
//                 left++;
//             }
//             while (left < right && !Character.isLetterOrDigit(s.charAt(right))) {
//                 right--;
//             }

//             System.out.println(s.charAt(left));
//             System.out.println(s.charAt(right));
//             if (s.charAt(left) != s.charAt(right)) {
//                 return false;
//             }
//             left++;
//             right--;
//         }

        // short way: loop 2 pointers at the same time
        for (int i = 0, j = s.length() - 1; i < j; i++, j--) {
            while ( i < j && !Character.isLetterOrDigit(s.charAt(i))) i++;
            while (i < j && !Character.isLetterOrDigit(s.charAt(j))) j--;

            if (s.charAt(i) != s.charAt(j)) return false;
        }

        return true;
    }
}
