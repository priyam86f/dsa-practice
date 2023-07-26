import java.util.*;
public class countSal {
    public static void main(String[] args) {
        int[] sals = {24000,34000,56000,67000,32000};
        double res = sal(sals);
        System.out.println(res);
    }

    public static double sal(int[] salary){
        int n = salary.length;
       Arrays.sort(salary);
       int sum=0;

       for(int i=1;i<n-1;i++){
         sum=sum+salary[i];
       }
       double avg = (double)sum/(n-2);
       return avg;
    }
}
