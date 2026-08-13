// Last updated: 8/12/2026, 7:22:40 PM
class Solution {
    public int[] concatWithReverse(int[] nums) {
        int[] ans = new int[2*nums.length];

        for (int i = 0; i < nums.length; i++) {
            ans[i] = nums[i];
            ans[2 * nums.length - 1 - i] = nums[i];
        }

        
        return ans;

    }
}