class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        if len(nums)==0:
            return 0
        compareVar=nums[0]
        counter=1
        for x in nums:
            if x != compareVar:
                nums[counter]=x
                counter+=1
                compareVar=x
        # print(nums)
        return counter  
                