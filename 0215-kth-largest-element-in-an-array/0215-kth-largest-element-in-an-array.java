class Solution {
    public int findKthLargest(int[] nums, int k) {
        // Set<Integer> hashset = new HashSet<Integer>();
        // for(int x:nums){
        //     hashset.add(x);
        // }
        // ArrayList<Integer> al=new ArrayList();
        //  for (Integer value : hashset)
        //      al.add(value)
            // System.out.print(value + ", ");
        // nums=hashset.toArray();
        // hashset
        Arrays.sort(nums);
        return nums[nums.length-k];
        //1 2 3 3 4 5 5 6
    }
}