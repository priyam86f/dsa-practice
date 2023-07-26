import java.util.HashSet;

public class multiplyFoundVals {
    public static void main(String[] args) {
        int[] ar = {4,8,3,10,6,45,12,34,24};
        int res = foundvals(ar, 4);
        System.out.println(res);
    }

    public static int foundvals(int[] nums,int target){
        HashSet<Integer> set = new HashSet<>();
        int ans=target;

        for(int i : nums){
            set.add(i);
        }

        while(set.contains(ans)){
            if(!set.contains(ans)){
                break;
            }
            ans*=2;
        }
        return ans;
    }
}
