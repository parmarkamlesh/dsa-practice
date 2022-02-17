class Solution:
    def isPowerOfFour(self, n: int) -> bool:
        if n==1:
            return True
        else:
            return n>=4 and n%4==0 and self.isPowerOfFour(n//4)  