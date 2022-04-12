class Solution {
    public int specialArray(int[] nums) {
        for(int i=1;i<1001;i++){
            int counter=0;

            for(int n:nums){
            
                if(n>=i){
                    counter++;
                }

            }
            
            if(counter==i){
                return counter;
            }
        }
        return -1;
    }
}