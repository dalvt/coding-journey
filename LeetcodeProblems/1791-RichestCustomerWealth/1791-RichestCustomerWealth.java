// Last updated: 7/8/2026, 23:05:11
class Solution {
    public int maximumWealth(int[][] accounts) {
        int mx  = 0;
        int aux  = 0;
        for (int i = 0; i < accounts.length; i++) {
            aux = 0;
            for (int j = 0; j < accounts[i].length; j++) {
                aux += accounts[i][j];
            }
            if (aux > mx) {
                mx = aux;
            }
        }

        return mx;
        
    }
}