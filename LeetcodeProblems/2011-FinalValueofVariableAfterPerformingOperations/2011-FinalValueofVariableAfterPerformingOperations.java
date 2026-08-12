// Last updated: 11/8/2026, 21:43:43
1class Solution {
2    public int finalValueAfterOperations(String[] operations) {
3        int x = 0;
4        for (String str : operations) {
5            if (str.equals("X++") || str.equals("++X")) {
6                x++;
7            } else {
8                x--;
9            }
10            
11        }
12        return x;
13    }
14}