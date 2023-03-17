class Solution {
    public int getSquare(int num){
        int ans=0;
        while(num!=0){
            int temp=num%10;
            ans+=temp*temp;
            num/=10;
        }
        return ans;
    }
    public boolean isHappy(int n) {
        int slow=n;
        int fast=n;
        
        do{
            slow=getSquare(slow);
            fast=getSquare(getSquare(fast));
        }while(slow!=fast);
        
        if(slow==1){
            return true;
        }
        return false;
    }
}