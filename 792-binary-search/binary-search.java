class Solution {
    public int search(int[] nums, int target) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;

        for(int i = 0; i < n; i++) {
            int mid = (right - left) + left / 2;

            if(nums[mid] == target) {
                return mid;
            } 
            if(nums[mid] < target) {
                left = mid + 1;
            } 
            if(nums[mid] > target) {
                right = mid - 1;
            }
        }
        return -1;
    }
}