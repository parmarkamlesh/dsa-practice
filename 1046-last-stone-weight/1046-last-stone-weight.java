class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : stones){
            pq.add(x);
        }
        while(pq.size()>1){
            int bigest=pq.poll();
            int secondbig=pq.poll();
            
            if(bigest!=secondbig){
                pq.add(bigest-secondbig);
            }
        }
        if(pq.size()==0)
            return 0;
        else
            return pq.peek();
    }
}
