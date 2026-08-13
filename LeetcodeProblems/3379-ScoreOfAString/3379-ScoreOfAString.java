// Last updated: 8/12/2026, 7:22:41 PM
class Solution {
    public int scoreOfString(String s) {

        int[] array = new int[s.length()];

        for (int i = 0; i < s.length(); i++) {
            char letra = s.charAt(i);
            int ascii = (int) letra;
            array[i] = ascii;
        }

        int sl = 0;
        int f = 1;
        int sum = 0;
        
        while (f < array.length ) {
            sum += Math.abs(array[sl] - array[f]);
            f++;
            sl++;
        }

        return sum;
    }
        
}