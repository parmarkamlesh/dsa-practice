class Solution {
    public int missingNumber(int[] nums) {
        //lie return (((nums.length+1)*nums.length)/2)-Arrays.stream(nums).sum();
        int sm=0;
        for(int i:nums) sm+=i;
        return (nums.length+1)*nums.length/2 - sm;
       
    }
}
