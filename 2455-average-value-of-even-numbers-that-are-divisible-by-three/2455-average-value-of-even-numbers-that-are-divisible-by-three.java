class Solution {
    public int averageValue(int[] nums) {
        int sum=0,count=0;
        for(int i:nums){
            if(i%3==0 && i%2==0){
                sum+=i;
                count++;
            }
        }
        if(count==0) return 0;
        return Math.round(sum/count);  
    }
}