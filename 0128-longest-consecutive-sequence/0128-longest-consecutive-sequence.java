class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        
        int strikelong=1;
        int strikecurr=1;
        
        for(int i=1;i<nums.length;i++){
            if(nums[i]!=nums[i-1]){
                if(nums[i]==nums[i-1]+1){
                    strikecurr++;
                }else{
                    strikelong=Math.max(strikelong,strikecurr);
                    strikecurr=1;
                }
            }
        }
        return Math.max(strikecurr,strikelong);
    }
}