class Solution {
    public int maximumCount(int[] nums) {
        int nc=0;
        int mc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<0){
                nc++;
            }
            if(nums[i]>0){
                mc++;
            }
            
        }
        return Math.max(nc,mc);
    }
}