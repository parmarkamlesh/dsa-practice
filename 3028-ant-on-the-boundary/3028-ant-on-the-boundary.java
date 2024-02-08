class Solution {
    public int returnToBoundaryCount(int[] nums) {
     int ret=0;
     int bnd=0;
     for(int i:nums){
         if(i>0)
             ret+=i;
         if(i<0)
             ret-=Math.abs(i);
         if(ret==0)
             bnd++;
     }
        return bnd;
    }
}