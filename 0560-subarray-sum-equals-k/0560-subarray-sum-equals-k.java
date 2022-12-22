class Solution {
    public int subarraySum(int[] nums, int k) {
        int counter=0;
//         int[] summer=new int[nums.length+1];
//         summer[0]=0;
        
//         for(int i=1;i<=nums.length;i++){
//             summer[i]=summer[i-1]+nums[i-1];
//         }
//         //[0, 1, 3, 6]
//         for(int start=0;start<nums.length;start++){
//             for(int end=start+1;end<=nums.length;end++){
//                 if(summer[end]-summer[start]==k){
//                     counter++;
//                 }
//             }            
//         }
        for(int start=0;start<nums.length;start++){
            int localsum=0;
            for(int end=start;end<nums.length;end++){
                localsum+=nums[end];
                if(localsum==k){
                    counter++;
                }
            }
        }
        return counter;
    }
}