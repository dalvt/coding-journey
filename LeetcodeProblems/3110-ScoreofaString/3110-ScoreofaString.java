// Last updated: 9/8/2026, 21:35:38
1class Solution {
2    public int scoreOfString(String s) {
3
4        int[] array = new int[s.length()];
5
6        for (int i = 0; i < s.length(); i++) {
7            char letra = s.charAt(i);
8            int ascii = (int) letra;
9            array[i] = ascii;
10        }
11
12        int sl = 0;
13        int f = 1;
14        int sum = 0;
15        
16        while (f < array.length ) {
17            sum += Math.abs(array[sl] - array[f]);
18            f++;
19            sl++;
20        }
21
22        return sum;
23    }
24        
25}