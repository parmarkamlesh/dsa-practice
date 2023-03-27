class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        lastIndex = len(nums) - 1
        starterIndex = lastIndex
        while starterIndex >= 0:
            if nums[starterIndex] == val:
                nums[lastIndex], nums[starterIndex] = nums[starterIndex], nums[lastIndex]
                lastIndex-=1
            starterIndex-=1
        return lastIndex+1