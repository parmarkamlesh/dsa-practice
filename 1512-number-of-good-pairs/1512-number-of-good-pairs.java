class Solution {
    public int numIdenticalPairs(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        
        int ans = 0;
        for(int n:nums)
        {
            int cnt = hm.getOrDefault(n,0);
            ans+=cnt;
            hm.put(n,cnt+1);
        }        
        return ans;
    }
}