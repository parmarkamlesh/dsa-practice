class Solution {
    public int[] twoSum(int[] nums, int target) {
        
        // int[] output=new int[2];
        HashMap<Integer,Integer> occuranceMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
        
            int temp=target-nums[i];
            
            if(occuranceMap.containsKey(temp)){
                int[] output=new int[2];
                output[0]=i;
                output[1]=(int)occuranceMap.get(temp);
                return output;
            }
            
            occuranceMap.put(nums[i],i);

        }
        
        return new int[]{-1,-1};
    }
}