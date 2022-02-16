public class Solution {
    // you need to treat n as an unsigned value
    public int hammingWeight(int n) {
        int temp=n;
        int counter=0;
        for(int i=1;i<33;i++){
            if (((temp>>i) & 1)==1){
                counter++;
            }
        }
        return counter;
    }
}