public List<Integer> findDisappearedNumbers(int[] nums) {
        int n = nums.length;
        List<Integer> ans = new ArrayList<>();
        Set<Integer> hs = new HashSet<>();
        
        for (int i = 0; i < n; i++) {
            hs.add(nums[i]);
        }
        for (int i = 1; i <= n; i++) {
            if (!hs.contains(i)) {
                ans.add(i);
            }
        }
        System.out.println(hs);
        return ans;
    }
