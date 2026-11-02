class Solution {
    public int minMoves(int[] nums) {
        Arrays.sort(nums);

        int min = nums[0];
        int moves = 0;

        for(int num : nums) {
            moves += num - min;
        }

        return moves;
    }
}