package dsa_sheet;

public class stockprofit {
    public static int maxProfit(int[] prices) {
        int maxprofit = 0;
        int buyprice = Integer.MAX_VALUE;
        for(int i = 0; i< prices.length; i++){
            if(buyprice<prices[i])
            {
                int profit = prices[i]-buyprice;
                maxprofit = Math.max(maxprofit,profit);
            }
            else {
                buyprice = prices[i];
            }
        }
        return maxprofit;
    }
    public static void main(String[] args){
//        Input: prices = [7,1,5,3,6,4]
//        Output: 5
        int[] arr= {7,6,4,3,1};
        System.out.println(maxProfit(arr));
    }
}
