import java.util.HashSet;

public class happynumber {
    public static void main(String[] args) {
        int n = 19;
        boolean ans = isHappy(n);
        System.out.println(ans);
    }


    public static boolean isHappy(int n){
    HashSet<Integer> set = new HashSet<>();

    while(!set.contains(n)){
        set.add(n);
        n=sumOfSquares(n);

        if(n==1){
            return true;
        }
        
    }
    return false;
    }


    public static int sumOfSquares(int n){
        int digit = 0;
        int sum = 0;

        while(n!=0){
            digit = n%10;
            digit*=digit;
            sum=sum+digit;
            n=n/10;
        }

        return sum;
    }
}
