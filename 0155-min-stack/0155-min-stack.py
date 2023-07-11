class MinStack:

    def __init__(self):
        """
        initialize your data structure here.
        """
        self.stack=[]
        self.slen=-1
        self.minelement=99999999999

    def push(self, val: int) -> None:
        self.stack.append(val)
        self.slen+=1
        if self.minelement>=val:
            self.minelement=val
        

    def pop(self) -> None:
        elm=self.stack.pop()
        self.slen-=1
        if elm==self.minelement:
            if self.slen>=0:
                self.minelement=min(self.stack)
            else:
                self.minelement=99999999999
    def top(self) -> int:
        return self.stack[self.slen]

    def getMin(self) -> int:
        return self.minelement#min(self.stack)


# Your MinStack object will be instantiated and called as such:
# obj = MinStack()
# obj.push(val)
# obj.pop()
# param_3 = obj.top()
# param_4 = obj.getMin()