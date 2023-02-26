class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
		ArrayList<Integer> alt = new ArrayList();
		HashMap<Integer, Integer> n1map = new HashMap();

        for (int i: nums1) {
			n1map.put(i,1);
		}
        
        for(Integer x:nums2){
            if(n1map.getOrDefault(x,0)==1){
                alt.add(x);
                n1map.put(x,0);
            }
        }

        int[] oparray = new int[alt.size()];
		
        for (int i = 0; i<alt.size(); i++) {
			oparray[i] = alt.get(i);
		}
		
        return oparray;    
    }
}