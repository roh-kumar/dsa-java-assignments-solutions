class Solution {
    public int maximumWealth(int[][] accounts) {
        int max = Integer.MIN_VALUE;
        for(int[] row: accounts) {
            int sum = 0;
            for(int element : row) {
                sum += element;
            }
            if(max < sum) max = sum;
        }
        return max;
    }
}