// Q. Pick two days from a price list — one to buy and one to sell , such that the selling day comes after the buying day and the profit is maximized. What is that maximum profit? Return 0 if no profit is achievable
public class Stock_by_sell
{
    public static int maxProfit(int[]prices){
        if(prices==null || prices.length<2){
            return 0;
        }
        int minPrice=prices[0];
        int maxProfit=0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minPrice){
                minPrice=prices[i];
            }
            else{
                int currentProfit=prices[i]-minPrice;
                if(currentProfit>maxProfit){
                    maxProfit=currentProfit;
                }
            }
        }
        return maxProfit;
        
    }
	public static void main(String[] args) {
		int priceList[]={1,2,5,6, 9};
		int profit1=maxProfit(priceList);
		System.out.println("max profit for sales "+profit1);
		
	}
}
