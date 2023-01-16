class Solution:
    def rotateString(self, s: str, goal: str) -> bool:
        if(s=="" and goal==""):
            return True
        def rotate(inp):
            stringSource=list(inp)
            store=""
            for ind in range(0,len(stringSource)):  
                if(ind==0):
                    store=stringSource[ind]
                if(ind==len(stringSource)-1):
                    stringSource[ind]=store
                    continue
                stringSource[ind]=stringSource[ind+1]
            return "".join(stringSource)
        
        result=s
        for ind in range(0,len(s)):
            result=rotate(result)
            if goal==result:
                return True
        return False