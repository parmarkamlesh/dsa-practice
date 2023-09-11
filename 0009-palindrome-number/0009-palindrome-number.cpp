class Solution {
public:
    bool isPalindrome(int x) {
        long int toCompare=x;
        long int reverse=0;
        if (x<0)
            return false;
        while(x!=0){
            int rem=x%10;      
            reverse=(reverse*10) + rem;    
            x/=10;
        }
        return reverse==toCompare;
    }
};