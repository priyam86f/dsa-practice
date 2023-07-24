public class sumMultiples{
    public static void main(String[] args) {
        int x = multiples(10);
        System.out.println(x);
    }


    public static int multiples(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%3==0||i%5==0||i%7==0){
                sum+=i;
            }
        }
        return sum;
    }
}