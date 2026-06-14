import java.util.Arrays;
public class BuyStocks {
    public static void BuySellStock(int prices[]){
        int sp=0;
        int bp = prices[0];
        int minIndex = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < bp) {
                bp = prices[i]; // Update the minimum value
                minIndex = i;         
            }
        }
        System.out.println(" " + bp + " " + minIndex);
        int arrBuy[] = {bp , minIndex};
        
        for(int i=0;i<prices.length;i++){
            if(bp<prices[i] && arrBuy[1] < i && prices[i] > sp){
                sp = prices[i];
            }
        }
        int profit =0;
        profit = sp-bp;
        System.out.println(("The profit is going to be:" + profit + " With the bp as " + bp + " and the selling price as :" + sp));
    }
    public static void main(String args[]){
        int prices[]= {7,1,5,3,6,4};
        BuySellStock(prices);
    }
}
