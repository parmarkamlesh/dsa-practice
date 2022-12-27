class Solution {
    public int captureForts(int[] nums) {
        int mx = 0 , cur_max = 0 , prev=0 ; 
        boolean flag = false ; 
        for(int i =1;i<nums.length;i++)
        {
            if(nums[i]==0 && nums[i-1]!=0)
            {
                flag = true ; 
                prev = nums[i-1];
            }
            if(nums[i]!=0)
            {
                if(nums[i]!=prev && flag)
                mx = Math.max(mx,cur_max);
                flag = false ;  
                cur_max = 0 ; 
            }
            if(flag)cur_max++ ; 
        }
        return mx ; 
    }
}