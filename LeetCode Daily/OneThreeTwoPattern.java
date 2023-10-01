import java.util.*;


class Pair{
    int min;
    int num;

    Pair(int num, int min){
        this.num=num;
        this.min=min;
    }
}
public class OneThreeTwoPattern {
    public static void main(String[] args) {
        int[] nums = {3,1,-1,0,4};
        boolean result = one_thirty_Twopattern(nums);
        System.out.println(result);
    }



    public static boolean one_thirty_Twopattern(int[] nums){
        int n = nums.length;
        Stack<Pair> stack = new Stack<>();
        int current_Mininmum = nums[0];

        for(int i=1;i<n;i++){
            while(!stack.isEmpty() && nums[i]>=stack.peek().num){
                stack.pop();
            }

            if(!stack.isEmpty() && nums[i]<stack.peek().num && nums[i]>stack.peek().min){
                return true;
            }
            current_Mininmum=Math.min(nums[i], current_Mininmum);
            stack.push(new Pair(nums[i],current_Mininmum));
        }

        return false;
    }
}
