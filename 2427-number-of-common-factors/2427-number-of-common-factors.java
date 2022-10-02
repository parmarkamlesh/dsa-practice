class Solution {
    public int gcd(int a,int b){
        if(a==0)
            return b;
        return gcd(b%a,a);
    }
    public int commonFactors(int a, int b) {
        int num=gcd(a,b);
        int op=0;
        for(int i=1;i<=Math.sqrt(num);i++){
            if(num%i==0){
                if(num/i==i){
                    op+=1;
                }else{
                    op+=2;
                }
            }
        }
        return op;
    }
}