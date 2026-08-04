class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for(int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }

        List<Integer> ans = new ArrayList<>();
        for(int i = min; i <= max; i++) {
            if(!set.contains(i)) {
                ans.add(i);
            }
        }
        return ans;
    }
}