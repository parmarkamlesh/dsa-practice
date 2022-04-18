class Solution {
    public int counter(int n){
        int ret=0;
        
        while(n>0){
            ret+=n&1;
            n>>=1;
        }
        
        return ret;
    }
    public int[] countBits(int n) {
        
        if(n==0){
            return new int[]{0};
        }
        
        int[] op=new int[n+1];
        
        for(int i=n;i>=0;i--){
            op[i]=counter(i);            
        }
        
        return op;
    }
}