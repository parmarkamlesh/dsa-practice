class Solution:
    def isPalindrome(self, x: int) -> bool:
        toCompare=x
        reverse=0
        if x<0:
            return False
        while x!=0:
            rem=x%10      
            reverse=(reverse*10) + rem    
            x//=10
        return reverse==toCompare