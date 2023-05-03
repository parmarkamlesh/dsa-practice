class Solution {
    public List<Integer> finder(int[] nums1,int[] nums2){
        Set<Integer> onlyN1 = new HashSet<>();
        
        for(int i : nums1){
            boolean exitinN2 = false;
            
            for(int j : nums2){
                if(j == i){
                    exitinN2 = true;
                    break;
                }
            }
            
            if(!exitinN2)
                onlyN1.add(i);
        }
        return new ArrayList<>(onlyN1);        
    }
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        return Arrays.asList(finder(nums1,nums2),finder(nums2,nums1));
    }
}