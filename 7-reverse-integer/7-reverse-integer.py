class Solution:
    def reverse(self, x: int) -> int:
        isNegative=False
        reverse=0
        if x<0:
            isNegative=True 
            x=abs(x)
        while x!=0:
            rem=x%10      
            reverse=(reverse*10) + rem    
            x//=10
        if reverse.bit_length()>=32:
            return 0
        if isNegative:
            return reverse*-1
        else:
            return reverse
