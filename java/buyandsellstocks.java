public class buyandsellstocks {
    public static void stocks(int prices[]) {

        //steps
        //sabse phele buying price lo max mai kyuki min value of buying price chahiye
        //phir loop chalao and if else leke profit nikalo 
        //phir max profit calculate kro
        //agar BP>SP toh uss din sell na krke buy krlo (else condition) taaki baad mai jyaada paiso mai bech apo

        //time complexity = O(n)
        
        int buy_price = Integer.MAX_VALUE;
        int max_profit = 0;

        for(int i=0;i<prices.length;i++) {
            if(buy_price<prices[i]) {
                int profit = prices[i] - buy_price;
                max_profit = Math.max( profit, max_profit);

            }
            else {
                buy_price = prices[i];
            }
        }
        System.out.println("maximum profit is " +max_profit);
    }

    public static void main(String args[]) {
        int prices[] = {7,1,5,3,6,4};
        stocks(prices);
    }
}
