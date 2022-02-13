class Solution {
    public List<List<Integer>> subsets(int[] nums) {

        List<List<Integer>> out=new ArrayList<>(nums.length);
        long powerSetPossible=(long)Math.pow(2,nums.length);

        for(int i=0;i<powerSetPossible;i++){
            
            List<Integer> temp=new ArrayList<Integer>();

            for(int j=0;j<nums.length;j++){

                if((i & (1 << j)) > 0)
                    temp.add(nums[j]);

            }
            out.add(i,temp);

        }
        return out;
    }
}