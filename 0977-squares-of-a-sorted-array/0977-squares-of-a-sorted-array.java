class Solution {
    public int[] sortedSquares(int[] nums) {
        int start=0;
        int end=nums.length-1;
        while(start<=end){
            nums[start]=nums[start]*nums[start];
            if(start!=end)
            nums[end]=nums[end]*nums[end];
            start++;
            end--;
        }
        Arrays.sort(nums);
        return nums;
    }
}