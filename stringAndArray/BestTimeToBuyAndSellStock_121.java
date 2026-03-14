package stringAndArray;

public class BestTimeToBuyAndSellStock_121 {
	public int maxProfit(int[] prices) {
        int result = 0 ;
        int min = Integer.MAX_VALUE ;
        for(int i = 0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }else{
                int temp = prices[i]-min;
                if(temp>result){
                    result=temp;
                }
            }
        }
        return result;
    }
}
