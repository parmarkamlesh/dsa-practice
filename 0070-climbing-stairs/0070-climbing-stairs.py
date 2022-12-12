class Solution:
    def climbStairs(self, n: int) -> int:
        #1836311903
        #45
        # 1 2 3 4 bottom up tabution
        arr=[1,2]
        if n==1:
            return 1
        for x in range(2,n):
            arr.append(arr[x-1]+arr[x-2])
        return (arr[len(arr)-1])