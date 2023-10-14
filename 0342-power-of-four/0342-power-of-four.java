class Solution {
    public boolean isPowerOfFour(int n) {
        if (n==1)
            return true;
        else
            return n>=4 && n%4==0 && isPowerOfFour(n/4);        
    }
}