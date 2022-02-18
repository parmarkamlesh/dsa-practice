class Solution:
    def reverseString(self, s: List[str]) -> None:
        """
        Do not return anything, modify s in-place instead.
        """
        startp=0
        endp=len(s)-1
        while startp<=endp:
            s[startp],s[endp]=s[endp],s[startp]
            startp+=1
            endp-=1
        
        