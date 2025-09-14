// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/
class BestTime {
    public static void main(String[] args) {
        int[] prices = {7,6,5,4,3,2,1};
        System.out.println(bestTime(prices));
    }
    static int bestTime (int[] prices){
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0 ;
        for(int price : prices){
            if(price < minPrice){
                minPrice = price ;
            }else{
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }
        return maxProfit;
    }
}