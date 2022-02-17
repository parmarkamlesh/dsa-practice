class Solution {
    public void moveZeroes(int[] nums) {
        int zeroRemind=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[zeroRemind]=nums[i];
                zeroRemind++;
            }    
        }
        for(int i=zeroRemind;i<nums.length;i++){
            nums[i]=0;
        }
        
    }
}