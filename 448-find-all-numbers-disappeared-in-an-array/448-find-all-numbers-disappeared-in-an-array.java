class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        
        for(int i=0;i<nums.length;i++){
            int ind=Math.abs(nums[i])-1;            
            nums[ind]=(nums[ind]>0)?-nums[ind]:nums[ind];
        }
        
        ArrayList<Integer> al=new ArrayList<Integer>();
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                al.add(i+1);
            }            
        }
        // System.out.println(Arrays.toString(nums));
        // HashMap<Integer,Integer> hm=new HashMap<Integer,Integer>();
        // int n=nums.length;
        // for(int i=1;i<=n;i++){
        //     hm.put(i,0);            
        // }
        // for(int a:nums){
        //     hm.put(a,1);
        // }
        // ArrayList<Integer> al=new ArrayList<Integer>();
        //    for(Map.Entry m : hm.entrySet()){
        //     if(0==(int)m.getValue()){
        //         al.add((Integer)m.getKey());
        //     }
        //    }
        return al;
    }
}