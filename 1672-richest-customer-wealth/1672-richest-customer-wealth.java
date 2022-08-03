class Solution {
    public int maximumWealth(int[][] accounts) {
        int sum = 0;
        int[] wealth = new int[accounts.length];
        for (int i = 0; i < accounts.length; i++) {
            int[] acc = accounts[i];
            for (int j = 0; j <acc.length ; j++) {
                sum = sum + acc[j];
            }
            wealth[i] = sum;
            sum = 0;
        }
        int max = wealth[0];
        for (int compareValue:wealth
             ) {
            max = max >= compareValue? max :compareValue;
        }
        return max;
    }
}