public boolean isSubsequence(String s, String t) {
        int counter = 0;
        int pointer = 0;
        for (char c : s.toCharArray()) {
            while (pointer < t.length()) {
                if (c == t.charAt(pointer)) {
                    counter++;
                    pointer++;
                    break;
                }
                pointer++;
            }
        }
        System.out.println(counter);
        if (counter == s.length()) return true;

        return false;
    }
