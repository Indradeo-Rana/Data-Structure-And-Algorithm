package ArrayList;

import java.util.ArrayList;

public class StockBuyNdSell {
    static int maxProfit(ArrayList<Integer> prices){
        int maxPro=0;
        int minVal=Integer.MAX_VALUE;
        for(int i : prices){
            minVal=Math.min(i, minVal);
            maxPro=Math.max(maxPro, i-minVal);
        }
        return maxPro;
    }
    public static void main(String[] args) {
        ArrayList<Integer> prices= new ArrayList<>();
        prices.add(10);
        prices.add(5);
        prices.add(1);
        prices.add(6);
        prices.add(4);
        prices.add(2);

        System.out.println("Maximum Profit :"+maxProfit(prices));
    }
}
