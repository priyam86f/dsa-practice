import java.util.HashSet;

public class sumOfMultiples {
    public static void main(String[] args) {
        int x = 24;
        int res = summult(x);
        System.out.println(res);
    }


    /*write a program to find the sum of all multiples 
     of 3 and 7 below 'N'.
     Numbers should not repeat themselves.
    */

    public static int summult(int n){
        HashSet<Integer> set  =new HashSet<>();
        int sum = 0;
      for(int i=0;i<n;i++){
        if(i%3==0 || i%7==0){
            if(!set.contains(i)){
                sum+=i;
                set.add(i);
            }
        }
      }
return sum;
    }
}
