class Solution:
    def moveZeroes(self, nums: List[int]) -> None:
        zeroRemind=0
        for x in range(len(nums)):
            if nums[x]!=0:
                nums[zeroRemind]=nums[x]
                zeroRemind+=1
        for x in range(zeroRemind,len(nums)):
            nums[x]=0