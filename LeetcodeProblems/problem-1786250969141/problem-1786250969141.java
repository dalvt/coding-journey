// Last updated: 8/8/2026, 23:49:29
1class Solution {
2    public int findNumbers(int[] nums) {
3        int even = 0;
4        for (int num: nums) {
5            String numS = String.valueOf(num);
6            if (numS.length() % 2 == 0) {
7                even += 1;
8            }
9        }
10        return even;
11    }
12}