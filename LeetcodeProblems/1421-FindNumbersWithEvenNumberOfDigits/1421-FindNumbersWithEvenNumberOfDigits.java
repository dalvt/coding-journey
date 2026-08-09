// Last updated: 8/8/2026, 23:50:27
class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int num: nums) {
            String numS = String.valueOf(num);
            if (numS.length() % 2 == 0) {
                even += 1;
            }
        }
        return even;
    }
}