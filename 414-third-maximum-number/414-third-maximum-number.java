class Solution {
    public int thirdMax(int[] nums) {
        long f = Long.MIN_VALUE;
        long s = Long.MIN_VALUE;
        long t = Long.MIN_VALUE;
        for (int n: nums) {
            if (n == f || n == s || n == t)
                continue;
            if (n >= f) {
                t = s;
                s = f;
                f = n;
            } else if (n >= s) {
                t = s;
                s = n;
            } else if (n >= t) {
                t = n;
            }
        }
        if (t != Long.MIN_VALUE)
            return (int)t;
        else if (f != Long.MIN_VALUE)
            return (int)f;
        else
            return (int)s;
    }
}