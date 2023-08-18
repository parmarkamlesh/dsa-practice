class Solution {
    public int findPairs(int[] nums, int k) {
        int cnt=0;
        HashMap<Integer,Integer> map=new HashMap();
        for(int x:nums){
            map.put(x,map.getOrDefault(x,0)+1);
        }
        for(int n:map.keySet()){
            if(k==0){
                if(map.get(n)>1){
                    cnt++;
                }
            }
            else{
                if(map.containsKey(n+k))
                    cnt++;
            }
        }
return cnt;
    }
}