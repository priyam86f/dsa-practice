public class validPerfectSquare {
    public static void main(String[] args) {
        int x = 7;
        boolean result = perfectSquare(x);
        System.out.println(result);
    }

    public static boolean perfectSquare(int n){
        int low = 1;
        int high = n;
        boolean result = false;

        while(low<=high){
            int mid = low + (high-low)/2;

            if(Math.pow(mid, 2)==n){
                result = true;
                break;
            }else if(Math.pow(mid, 2)<n){
              low=mid+1;
            }else if(Math.pow(mid, 2)>n){
                high=mid-1;
            }
        }
        return result;
    }
}
