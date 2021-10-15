public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int s = 1;
        int e = n;
        while (s < e) {
            int m = s + (e - s) / 2;
            int num = guess(m);
            if (num == 0) {
                return m;
            }
            if (num == -1) {
                e = m - 1;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
}