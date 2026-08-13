// Last updated: 8/12/2026, 7:22:43 PM
class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x = 0;
        for (String str : operations) {
            if (str.equals("X++") || str.equals("++X")) {
                x++;
            } else {
                x--;
            }
            
        }
        return x;
    }
}