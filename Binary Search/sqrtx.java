public class sqrtx {
    public static void main(String[] args) {
        int x = 4;
        int res = roundedsqrt(x);
        System.out.println(res);
    }


    public static int roundedsqrt(int n){
        int low=1;
        int high=n;
        int res=0;
        while(low<=high){
            int mid = low + ((high-low)/2);

            if(n>Math.pow(mid, 2)){
                low=mid+1;
                res=mid; //previous stored value
            }else if(n<Math.pow(mid, 2)){
                high=mid-1;
            }else{
                return mid;
            }
        }
        return res;
    }
}
