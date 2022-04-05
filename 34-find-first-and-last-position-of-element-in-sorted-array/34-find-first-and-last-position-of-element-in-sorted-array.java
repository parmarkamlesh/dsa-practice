class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] retarr={-1,-1};
        int start=0;
        int end=nums.length-1;
        while(start<nums.length){
            if(nums[start]==target){
                retarr[0]=start;
                retarr[1]=start;
                break;
            }
            start++;
        }
        while(end>-1){
            if(nums[end]==target){
                retarr[1]=end;
                break;
            }
            end--;
        }
        return retarr;
        
        
    }
}