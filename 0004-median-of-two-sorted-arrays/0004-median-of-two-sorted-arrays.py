class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nar=nums1+nums2
        nar.sort()
        if len(nar)==0:
            return float(0)
        if len(nar)%2==0:
            fmid=len(nar)//2
            smid=(len(nar)//2)-1
            return (nar[fmid]+nar[smid])/2
        else:
            middle = int(len(nar) / 2)
            return float(nar[middle])
        