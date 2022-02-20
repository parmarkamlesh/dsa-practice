class Solution {
    public int distributeCandies(int[] candyType) {
         Set<Integer> hset = new HashSet<Integer>();
        for(Integer x:candyType){
            hset.add(x);
        }
        if(hset.size()>(candyType.length/2) ){
            return candyType.length/2;
        }else{
            return hset.size();
        }
        // System.out.println(hset);
        // return 0;
    }
}