class Solution {
    public int reverse(int x) {
        long safe=Math.abs(x);
        boolean isNegative=(x<0)?true:false;
        long calc=0;
        long max100=0;

        while(safe>0){
            long t=(long)safe%10;
            safe=(long)(safe/10);         
            if(max100==0){
                max100=1;
            }else{
                max100=max100*10;
            }
        }
        
        safe=Math.abs(x);
        while(safe>0){
            long t=(long)safe%10;
            calc+=(t*max100);
            max100/=10;
            safe=(long)(safe/10);
        }
        if(isNegative){
            calc=-calc;
        }
        if( -2147483648<=calc && calc<=2147483647){
            return (int)calc;
        }else{
            return 0;
        }
    }
}