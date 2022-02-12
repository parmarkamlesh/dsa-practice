class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> outputArr=new ArrayList<Integer>(nums.length);
        
        for(int i=0;i<nums.length;i++){
            outputArr.add(index[i],nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            nums[i]=outputArr.get(i);
        }
        //modifing parameter arr because its pass by value        
        return nums;
    }
}