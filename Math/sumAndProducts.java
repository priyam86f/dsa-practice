public class sumAndProducts {
    public static void main(String[] args) {
       int n = 234;
       int ans = rizz(n);
       System.out.println(ans);
    }

public static int rizz(int n){
    int x = sumandproductdiff(n);
    int z = sumandproductdiff2(n);

    return x-z;
}
    public static int sumandproductdiff(int n){
        int x =1;
        int temp = n;
       
        while(temp>0){
            x*=temp%10;
            temp/=10;
        }
        return x;
    }

    public static int sumandproductdiff2(int n){
        int x =0;
        int temp = n;
       
        while(temp>0){
            x+=temp%10;
            temp/=10;
        }
        return x;
    }
    
}
