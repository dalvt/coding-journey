// Last updated: 7/8/2026, 23:05:09
class Solution {
    public int[] runningSum(int[] nums) {
        
        int[] ans  = new int[nums.length];
        int acm = 0;

        for (int i = 0; i < nums.length; i++) {
            acm += nums[i];
            ans[i] = acm;
        }
        return ans;
    }
}