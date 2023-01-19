class Solution {
    public int differenceOfSum(int[] nums) {
    //  East but lengthy
        int n = nums.length, rem = 0;
        int eleSum = 0, digitSum = 0;
        for(int i = 0; i < n; i++){
            eleSum += nums[i];
            if(nums[i] < 10)
                digitSum += nums[i];
            else{
                while(nums[i] != 0){
                    rem = nums[i] % 10;
                    digitSum += rem;
                    nums[i] /= 10;
                }
            }
            }
         return Math.abs(eleSum - digitSum);
    }
}