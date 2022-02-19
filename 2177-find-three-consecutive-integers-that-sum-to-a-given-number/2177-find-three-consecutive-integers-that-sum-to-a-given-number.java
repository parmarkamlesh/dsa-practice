class Solution {
    public long[] sumOfThree(long num) {
        long starter=num/3;
        long first=starter-1;
        long end=starter+1;
        if(first+starter+end == num){
            return new long[]{starter-1,starter,starter+1};        
        }else{
            return new long[]{};                    
        }
    }
}