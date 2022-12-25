class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
    int[] returnarr = new int[nums.length];
            for(int i = 0; i < nums.length ; i++){
                int countervar = 0;
                for(int j = 0; j < nums.length ; j++){
                    if(j != i && nums[j] < nums[i]){
                        countervar++;
                    }
                }

                returnarr[i] = countervar;
            }

            return returnarr;        
    }
}