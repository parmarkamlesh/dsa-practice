class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
    
		ArrayList<Integer> alt = new ArrayList();
		HashMap<Integer, Integer> n1map = new HashMap();
		HashMap<Integer, Integer> n2map = new HashMap();

		for (int i: nums1) {
			n1map.put(i, n1map.getOrDefault(i, 0) + 1);
		}

		for (int i: nums2) {
			n2map.put(i, n2map.getOrDefault(i, 0) + 1);
		}
		for (Integer a: n1map.keySet()) {
			
            if (n1map.containsKey(a) && n2map.containsKey(a)) {

                if (n1map.get(a) > 0 && n2map.get(a) > 0) {
						alt.add(a);
				}

            }
		}

        int[] oparray = new int[alt.size()];
		
        for (int i = 0; i<alt.size(); i++) {
			oparray[i] = alt.get(i);
		}
		
        return oparray;    
    }
}