class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        lastelement=len(nums)-1
        for x in range(0,k):
            nums.insert(0,nums.pop(lastelement))