class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0;
        for(String a:operations){
            if(a.charAt(1)=='+'){
                x+=1;
            }else{
                x-=1;
            }
        }
        return x;
    }
}