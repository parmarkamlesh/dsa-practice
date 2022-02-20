class Solution {
    public boolean digSum(int n){
        int sum=0;
        while(n!=0){
            sum+=(n%10);
            n/=10;
        }
        if(sum%2==0)
            return true;
        return false;
    }
    public int countEven(int num) {
        int counter=0;
        for(int i=1;i<=num;i++){
            if(digSum(i)){
                counter++;
            }
        }
        return counter;
        
    }
}