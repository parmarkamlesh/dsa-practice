class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {

        ArrayList<Integer> outputArr=new ArrayList<Integer>(nums.length);
        
        for(int i=0;i<nums.length;i++){
            outputArr.add(index[i],nums[i]);
        }
        
        //converting is better than nested loops to insert item in array
        int[] outputConverted=new int[nums.length];

        for(int i=0;i<nums.length;i++){
            outputConverted[i]=outputArr.get(i);
        }
        
        return outputConverted;
    }
}