// Last updated: 8/13/2026, 8:37:25 PM
1import java.util.ArrayList;
2
3class Solution {
4    public List<Integer> findWordsContaining(String[] words, char x) {
5        String y = String.valueOf(x);
6        ArrayList<Integer> ind = new ArrayList<>();
7        for (int i = 0; i < words.length; i++) {
8            if (words[i].contains(y)) {
9                ind.add(i);
10            }
11        }
12        return ind;
13    }
14}