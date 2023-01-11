class Solution {
    public int xorBeauty(int[] nums) {
        int fin = 0;
        for (int num : nums)
            fin ^= num;
        return fin; 
    }
}