class Solution {
    public int kthFactor(int n, int k) {
        for(int i=1;i<n+1;i++){
            if(n%i==0){
                k -=1;
                if(k==0){
                    return i;
                }
            }
        }
        return -1;
    }
}