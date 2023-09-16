class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        int n = nums.size();
        int count = 1, idx = 0;
        for (int i = 1; i < n; ++i) {
            if (nums.get(i - 1) > nums.get(i)) {
                // 1 2 3 4 0
//                 
                ++count;
                if (count > 2) return -1;
                idx = i;
            }
        }
        if (count == 1) return 0;
        if (count == 2) {
            return nums.get(0) > nums.get(n - 1) ? n - idx : -1;
        }
        return -1;
    }
}