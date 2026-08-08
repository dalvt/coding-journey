// Last updated: 7/8/2026, 22:22:04
1class Solution {
2    public int[] getConcatenation(int[] nums) {
3        
4        int n = nums.length;
5        int[] ans = new int[2 * n];
6        
7        for (int i = 0; i < n*2; i++) {
8            ans[i] = nums[i % nums.length];
9        }
10
11        return ans;
12    }
13}