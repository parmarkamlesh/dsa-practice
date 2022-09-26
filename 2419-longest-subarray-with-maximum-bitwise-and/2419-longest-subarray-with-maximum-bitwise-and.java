class Solution {
    public int longestSubarray(int[] nums) {
         int n=nums.length;
        int maxe=0;
        for(int e:nums){
            if(maxe<e)
                maxe=e;
        }
        int c=0;
        int maxc=0;
        
        for(int i=0;i<n;i++){
            if(nums[i]==maxe){
                c++;
                maxc=Math.max(maxc,c);
            }else{
                c=0;
            }
        }
        return maxc;
    }
}