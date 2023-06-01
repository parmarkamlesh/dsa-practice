class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        int money_left = money - (prices[0] + prices[1]);
        return money_left >=  0 ? money_left : money; 
    }
}