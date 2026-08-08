// Last updated: 7/8/2026, 22:47:01
1class Solution {
2    public int[] runningSum(int[] nums) {
3        
4        int[] ans  = new int[nums.length];
5        int acm = 0;
6
7        for (int i = 0; i < nums.length; i++) {
8            acm += nums[i];
9            ans[i] = acm;
10        }
11        return ans;
12    }
13}