class Solution {
    public int sumBase(int n, int k) {
        String temp= Integer.toString(n,k);
        int nm=Integer.parseInt(temp);
        int ans=0;
        while(nm>0){
            ans+=(nm%10);
            nm/=10;
        }
        return ans;
    }
}