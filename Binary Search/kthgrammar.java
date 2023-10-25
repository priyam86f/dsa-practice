import java.util.*;
public class kthgrammar {
    public static void main(String[] args) {
        int sol = kth_element_nth_row(5, 3);
        System.out.println(sol);
    }


    public static int kth_element_nth_row(int n, int k){
        int l = 1;
        int r = (int)Math.pow(2, n-1);
        int cur_el = 0;

        while(l<r){
            int mid = (l+r)/2;

            if(k<=mid){
                r=mid;
            }else{
                l=mid+1;
                cur_el = (cur_el==0) ? 1 : 0;
            }
        }
        return cur_el;
    }
}
