class Solution {
    public int[] shuffle(int[] nums, int n) {
        int[] op=new int[n*2];
        int start=0;
        int mid=n;
        
        int counter=0;
        for(int i=0;i<n;i++){
            op[counter]=nums[start];
            op[counter+1]=nums[mid];
            counter+=2;
            start++;
            mid++;
        }
        return op;
        
    }
}