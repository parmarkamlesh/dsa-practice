class Solution {
    public int findMin(int[] nums) {
        int minv=5001;
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            if(nums[start]< minv){
                minv=nums[start];
            }
            if(nums[end] < minv){
                minv=nums[end];
            }
            start++;
            end--;
        }
    return minv;
        
    }
}