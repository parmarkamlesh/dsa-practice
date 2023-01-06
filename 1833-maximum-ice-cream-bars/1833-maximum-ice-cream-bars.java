class Solution {
    public int maxIceCream(int[] costs, int coins) {
     Arrays.sort(costs);
        int n=costs.length;
        int ice=0;
        
        while(ice<n && costs[ice]<=coins){
            coins-=costs[ice];
            ice++;
        }
        return ice;
    }
}