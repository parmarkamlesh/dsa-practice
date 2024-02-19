class Solution {
    public boolean isPowerOfTwo(int n) {
        if (n==1)
            return true;
        else
            return n>=2 && n%2==0 && isPowerOfTwo(n/2);   
      // if(n==0)
      //   return false;
      // return  (n & (n-1)) ==0;
            
    }
}