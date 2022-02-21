class Solution {
    public int majorityElement(int[] a) {
         Arrays.sort(a);
       return a[a.length/2];
//         if(nums.length==1)
//             return nums[0];
//         Arrays.sort(nums);

//         int howManyTime=nums.length/2;
//         howManyTime+=1;
        
//         int counter=1;
        
//         for(int i=0;i<nums.length-1;i++){
        
//             if(nums[i]==nums[i+1]){
//                 counter++;
//                 if(counter>=howManyTime){
//                     return nums[i];
//                 }
//             }else{
//                 counter=1;
//             }

//         }
//         return 1;
 
    }
}