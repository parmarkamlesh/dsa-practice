class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        // if(nums.length==1){
        //     if(nums[0]==0)
        //         return 0;
        //     return 1;
        // }
        int maxF=0,sum1=0;
        for(int i=0;i<nums.length;i++){
            sum1+=nums[i];
            if(nums[i]==0)
                sum1=0;
            else{
                maxF=Math.max(sum1,maxF);
            }
        }
        return maxF;

    }
}