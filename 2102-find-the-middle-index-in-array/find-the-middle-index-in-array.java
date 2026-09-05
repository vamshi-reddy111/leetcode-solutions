class Solution {
    public int findMiddleIndex(int[] nums) {
        int t = 0;
        for (int num : nums) {
            t += num;
        }

        int left = 0;

        for (int i = 0; i < nums.length; i++) {
            if (left == t - left - nums[i]) {
                return i;
            }
            left += nums[i];
        }

        return -1;
    }
}