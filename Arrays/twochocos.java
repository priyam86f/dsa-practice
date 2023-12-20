import java.util.*;
public class twochocos {
    public static void main(String[] args) {
        int[] chocolates = {3,2,3};
        
        int sol = buyChoco(chocolates, 3);
        System.out.println(sol);
    }

    public static int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        //rule 1 - MUST buy 2 chocolates
         int count=2;
         int sol = money;

         for(int i=0;i<prices.length;i++){
             if(prices[i]<=money && count>0){
                 money-=prices[i];
                 count--;
             }
         }
         if(count!=0){
            return sol;
         }
         return money;
    }
}
