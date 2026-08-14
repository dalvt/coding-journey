// Last updated: 8/14/2026, 9:12:04 AM
1class Solution {
2    public int numJewelsInStones(String jewels, String stones) {
3        int cnt = 0;
4
5        for (String s : jewels.split("")) {
6            for (String z : stones.split("")) {
7                if (s.equals(z)) {
8                    cnt++;
9                }
10            }
11        }
12        return cnt;
13    }
14}