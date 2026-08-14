// Last updated: 8/14/2026, 8:58:59 AM
1import java.util.ArrayList;
2class Solution {
3    public int minPartitions(String n) {
4        // ArrayList<Integer> ints = ArrayList<>();
5        char mx = '0';
6        for (int i = 0; i < n.length(); i++) {
7            if (n.charAt(i) > mx) {
8                mx = n.charAt(i);
9            }
10        }
11        return mx - '0';
12    }
13    
14}