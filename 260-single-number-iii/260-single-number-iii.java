class Solution {
    public int[] singleNumber(int[] nums) {
        
        int[] output=new int[2];
        HashMap<Integer,Integer> map=new HashMap();
        
        for(int i:nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        
        boolean oneFound=false;
        
        for(int key: map.keySet()){
        
            if(map.getOrDefault(key,0)==1){
                output[oneFound?1:0]=key;
                oneFound=true;
            }
        
        }

        return output;
    }
}