public class Solution extends VersionControl {
    public int firstBadVersion(int n) {
        int s = 1;
        int e = n;
        while (s <= e) {
            if (s == e) {
                return s;
            }
            int m = s + (e - s) / 2;
            if (isBadVersion(m)) {
                e = m;
            } else {
                s = m + 1;
            }
        }
        return s;
    }
}