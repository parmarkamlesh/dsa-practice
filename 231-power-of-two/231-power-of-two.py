class Solution:
    def isPowerOfTwo(self, n: int) -> bool:        
        if n==1:
            return True
        else:
            return n>=2 and n%2==0 and self.isPowerOfTwo(n//2)        