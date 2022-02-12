class Solution:
    def createTargetArray(self, nums: List[int], index: List[int]) -> List[int]:
        outputList=[]#*len(nums)
        tempZip=zip(nums,index)
        for n,i in tempZip:
            outputList.insert(i,n)
            # print(n,i)
        return outputList