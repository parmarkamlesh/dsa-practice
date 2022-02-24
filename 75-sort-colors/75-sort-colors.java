class Solution {
    public void sortColors(int[] nums) {
        int z=0,o=0,t=0,lastindex=0;
        for(int i=0;i<nums.length;i++){
            switch(nums[i]){
                case 0:z++;break;
                case 1:o++;break;
                case 2:t++;break;                    
            }
        }
        
        for(int i=0;i<z;i++,lastindex++)
            nums[lastindex]=0;
        for(int i=0;i<o;i++,lastindex++)
            nums[lastindex]=1;
        for(int i=0;i<t;i++,lastindex++)
            nums[lastindex]=2;

    }
}