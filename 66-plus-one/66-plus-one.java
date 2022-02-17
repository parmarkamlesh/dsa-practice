class Solution {
    public int[] plusOne(int[] digits) {
        
        //not mine code 
        for(int i=digits.length-1;i>=0;i--) {
            if(digits[i]<9) {
                digits[i]+=1;
                return digits;
            } else {
                digits[i]=0;
            }
        }
        int[] op = new int[digits.length+1];
        op[0]=1;
        return op;
    }
}