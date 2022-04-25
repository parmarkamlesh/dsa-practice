class Solution {
    public int findClosestNumber(int[] nums) {
        //todo
        int ans=nums[0];
        
        for(int i=1;i<nums.length;i++)
		
            if(Math.abs(nums[i]) < Math.abs(ans) || nums[i] == Math.abs(ans))	
                ans = nums[i];

        return ans;        
    }
}