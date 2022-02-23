class Solution:
    def searchMatrix(self, mat: List[List[int]], target: int) -> bool:
        for i in mat:
            if i[0]<=target and target<= i[len(mat[0])-1]:
                low=0
                high=len(i)-1
                while low<=high:
                    mid=(low+high)//2
                    if i[mid]<target:
                        low=mid+1
                    elif i[mid]>target:
                        high=mid-1
                    else:
                        return True
                return False
        return False