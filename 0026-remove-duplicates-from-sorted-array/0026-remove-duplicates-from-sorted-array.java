class Solution {
    public int removeDuplicates(int[] nums) {
        int compareVar=nums[0];
        int counter=1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=compareVar){
                nums[counter]=nums[i];
                counter+=1;
                compareVar=nums[i];
            }
        }
        return counter;
    }
    
}