// calculate Best Time to Buy and Sell Stock 
class findProfite{
    public static int FindMax(int prices[]){
        if(prices==null || prices.length<2){
            System.out.println("we can't compare now");
        }
        int minprice=prices[0];
        int maxprofit=0;
        // doing traversal from second day to end
        for(int i=1;i<prices.length;i++){
            if(prices[i]<minprice){
                minprice=prices[i];
            }
            else{
                int currentprofit=prices[i]-minprice;
                if(currentprofit>maxprofit)
                maxprofit=currentprofit;
            }
        }
        return maxprofit;
        
    }
    public static void main(String args[]){
        int prices1[]={7,1,2,3,6,5};
        int prices2[]={8,2,3,4,2,9};
        System.out.println("testing 1 ->"+ FindMax(prices1));
        System.out.println("testing 2 ->"+ FindMax(prices2));
    }
}
