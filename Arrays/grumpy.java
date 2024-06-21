import java.util.HashMap;

public class grumpy {
    public static void main(String[] args) {
        int[] customers = {4,10,10};
        int[] grumpy = {1,1,0};
        int res = grumpy_bookstore_owner(customers, grumpy, 2);
        System.out.println(res);
    }


    public static int grumpy_bookstore_owner(int[] c,int[] g,int mins){
        int l=0;
        int r=0;
        int n = c.length;
        int sum=0;
        int max_sum=0;
        int window=0;
        int satisfied=0;

        for(r=0;r<n;r++){
            if(g[r]==1){
              window+=c[r];
            }else{
                satisfied+=c[r];
            }

            if(r-l+1>mins){
                if(g[l]==1){
                    window-=c[l];
                }
                l++;
            }

            max_sum = Math.max(max_sum, window);
            
            
        }
        int res = max_sum+satisfied;
        return res;
    }
    }