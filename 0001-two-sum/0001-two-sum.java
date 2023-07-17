class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer,Integer> occuranceMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){
        
            int temp=target-nums[i];

            if(occuranceMap.containsKey(temp)){

                return new int[]{i,occuranceMap.get(temp)};
            
            }
            
            occuranceMap.put(nums[i],i);

        }
        
        return new int[]{-1,-1};
    }
}