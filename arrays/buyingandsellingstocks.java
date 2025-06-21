public class buyingandsellingstocks{
    public static void bestprofit(int prices[]){
      //loop{
        //buying price
        //profit
        //maxprofit}
        int buyingprice=prices[0];
           int profit=0;
           int maxprofit=Integer.MIN_VALUE;
        for(int i=1;i<prices.length;i++){
            if(buyingprice<prices[i]){
                profit=prices[i]-buyingprice;
            }else{
                  buyingprice=prices[i];
            }

            if(maxprofit<profit){
             maxprofit=profit;
            }
        }

        System.out.print("maxprofit"+maxprofit);


    }

    public static void main(String arg[]){
        int price[]={7,3,5,8,10,3};
        bestprofit(price);
    }

}