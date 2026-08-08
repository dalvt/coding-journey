// Last updated: 7/8/2026, 22:21:29
class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];

        for (int num : nums) {
            min = Math.min(min, num);
            max = Math.max(max, num);

        }        

        int great = 1;
        for (int i = 1; i <= max; i++) {
            if (min % i == 0 && max % i == 0) {
                great = i;
            }
        }

        return great;
    }
}