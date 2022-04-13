class Solution {
 public int maxDistance(int[] nums1, int[] nums2) {
        //TODO
        int res = 0;
        int l1 = nums1.length;
        int l2 = nums2.length;
        
        
        for (int i = 0; i < l1; i++){
            int index = find(nums1[i], nums2); 
            
            if (index != -1){
                res = Math.max(res, index - i);
            }
        }
        return res;
    }
    
    private int find(int num, int[] nums2){
        int low = 0;
        int high = nums2.length - 1;
        
        while (low + 1 < high){
            int mid = low + (high - low) / 2;
            if (nums2[mid] >= num){
                low = mid;
            } else {
                high = mid;
            }
        }
        if (nums2[high] >= num){
            return high;
        } 
        if (nums2[low] >= num){
            return low;
        }
        return -1;
    }
}