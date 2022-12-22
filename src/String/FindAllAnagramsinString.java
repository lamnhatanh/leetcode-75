public List<Integer> findAnagrams(String s, String p) {
        List<Integer> ans = new ArrayList<>();
        
        // char[] charP = p.toCharArray();
        // Arrays.sort(charP);
        // String a = new String(charP);

        // for (int i = 0; i <= s.length() - p.length(); i++) {
        //     String cur = s.substring(i, i+p.length());
        //     char[] charCurrent = cur.toCharArray();
        //     Arrays.sort(charCurrent);
        //     String b = new String(charCurrent);
        //     if (b.equals(a)) {
        //         ans.add(i);
        //     }
        // }

        Map<Character, Integer> hm1 = new HashMap<>();
        Map<Character, Integer> hm2 = new HashMap<>();

        for (char c : p.toCharArray()) {
            hm1.put(c, hm1.getOrDefault(c, 0) + 1);
        }

        for (int i = 0; i < s.length(); i++) {
            hm2.put(s.charAt(i), hm2.getOrDefault(s.charAt(i), 0) + 1);

            if (i >= p.length()) {
                char c = s.charAt(i - p.length());
                if (hm2.get(c) == 1) {
                    hm2.remove(c);
                } else {
                    hm2.put(c, hm2.get(c) - 1);
                }
            }
            //System.out.println(hm2);

            if (hm2.equals(hm1)) {
                ans.add(i - p.length() + 1);
            }
        }

        return ans;

    }
