class Solution {
    public int buyChoco(int[] prices, int money) {
        int n=prices.length;
        Arrays.sort(prices);        
            if(money >=(prices[0]+prices[1])){
                money =money-prices[0]-prices[1];
                }
        
        return money;
    }
}