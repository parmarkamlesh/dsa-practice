class Solution {
    public int findDuplicate(int[] nums) {

        int[] temparr=new int[nums.length+1];
        
        for(int x : nums){
            temparr[x]++;
        }
        for(int i=0;i<temparr.length;i++){
            if(temparr[i]>1)
                return i;
        }
        return -1;        
        
        
        //method 2
        // Arrays.sort(nums);
        // // System.out.println(Arrays.toString(nums));
        // //no need to check index out of bound because
        // //problem guarnteed atleast 1 duplicate
        // for(int i=0;i<nums.length;i++){
        //     if(nums[i]==nums[i+1])
        //         return nums[i];
        // }
        // return -1;
    }
}