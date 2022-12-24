public boolean checkInclusion(String s1, String s2) {
        char[] chars = s1.toCharArray();
        Arrays.sort(chars);
        String str1 = new String(chars);

        for (int i = 0; i <= s2.length() - s1.length(); i++) {
            String cur = s2.substring(i, i+s1.length());
            char[] ch = cur.toCharArray();
            Arrays.sort(ch);
            String str2 = new String(ch);
            if (str1.equals(str2)) return true;
        }

        return false;
    }
