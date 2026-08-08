// Last updated: 7/8/2026, 22:21:30
class Solution {
    public int[] getConcatenation(int[] nums) {
        
        int n = nums.length;
        int[] ans = new int[2 * n];
        
        for (int i = 0; i < n*2; i++) {
            ans[i] = nums[i % nums.length];
        }

        return ans;
    }
}