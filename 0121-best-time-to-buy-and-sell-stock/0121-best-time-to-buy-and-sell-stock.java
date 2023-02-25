class Solution {
    public int maxProfit(int[] price) {
        int minPrice=Integer.MAX_VALUE;
        int maxPro=0;
        for(int i=0;i<price.length;i++){
            if(minPrice>price[i]){
                minPrice=price[i];
            }else if(price[i]-minPrice > maxPro){
                maxPro=price[i]-minPrice;
            }
        }
        return maxPro;
    }
}