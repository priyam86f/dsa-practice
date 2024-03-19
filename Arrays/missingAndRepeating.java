import java.util.*;

public class missingAndRepeating {
    public static void main(String[] args) {
        int[] res = { 1, 3, 1 };
        String sol = missing_And_repeating_num_Optimal_math(res);
        System.out.println(sol);
    }

    public static String missing_And_repeating_num_Optimal_math(int[] nums) {
        int n = nums.length;
        int S1n = (n * (n + 1)) / 2;
        int S2n = (n * (n + 1) * (2 * n + 1)) / 6;

        int S1 = 0;
        int S2 = 0;
        for (int i : nums) {
            S1 += i;
            S2 += i * i;
        }

        int val1 = S1n - S1;
        // val1 is actual sum - current sum
        // which is x - y
        int val2 = S2n - S2;
        // val2 is Actual sum of squares - current sum of squares.
        // which is x square - y square. it becomes, (x-y)(x+y).

        /* x + y */
        val2 = val2 / val1; // x+y is val2/(x-y) which is val1. hence val2 = val2/(x-y)
        // so to get the missing and repeating values we just need to add x+y with x-y

        // now x is val1+val2 by 2 as per the mathematics

        int x = val1 + val2 / 2;
        int y = x - val1;

        return "Missing :" + x + "Repeating" + y;

    }
}
