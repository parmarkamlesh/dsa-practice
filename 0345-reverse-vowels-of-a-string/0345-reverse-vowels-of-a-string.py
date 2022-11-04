class Solution:
    def reverseVowels(self, s: str) -> str:
        startp=0
        s1=list(s)
        endp=len(s1)-1
        while startp<=endp:
            if s1[startp].lower() in ('a','e','i','o','u'):
                if s1[endp].lower() in ('a','e','i','o','u'):
                    s1[startp],s1[endp]=s1[endp],s1[startp]
                    startp+=1
                    endp-=1
                else:
                    endp-=1
            else:
                startp+=1
        return "".join(s1)
        