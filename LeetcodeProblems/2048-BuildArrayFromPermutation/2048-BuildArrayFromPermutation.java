// Last updated: 7/8/2026, 22:40:49
class Solution {
    public int[] buildArray(int[] nums) {
        int[] ans = new int[nums.length]; 

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[nums[i]];
        }
        return ans;
    }
}