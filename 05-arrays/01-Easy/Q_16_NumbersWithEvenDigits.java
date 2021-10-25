class Solution {
    public int findNumbers(int[] nums) {
        int c = 0;
        for(int element : nums) {
            // if(countDigits(element) % 2 == 0) c++;
            int digits = (int)(Math.log10(element))+1; 
            if(digits % 2 == 0) c++;
        }
        return c;
    }
}