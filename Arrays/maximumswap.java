public class maximumswap {
    public static void main(String[] args) {
        int num = 2736;
        int mx = maximumSwap(num);
        System.out.println(mx);
    }

    public static int maximumSwap(int num) {
        // /*brute force solution O(n2) */
        // char[] digits = String.valueOf(num).toCharArray();
        // int max = Integer.MIN_VALUE;

        // for(int i=0;i<digits.length-1;i++){
        //     for(int j=i+1;j<digits.length;j++){
        //         if(digits[j] > digits[i]){
        //             //swap
        //             char s = digits[i];
        //             digits[i]=digits[j];
        //             digits[j]=s;
  
        //         }
        //     }
        // }

        // return Integer.parseInt(new String(digits));
         //optimal

         char[] digits = String.valueOf(num).toCharArray();
      int[] li = new int[10];//to store last occurences

      for(int i=0;i<digits.length;i++){
        li[digits[i]-'0'] = i; //li[2]=0, li[7]=1,li[3]=2 and so on.
      }

      for(int j=0;j<digits.length;j++){
        for(int k=9;k>digits[j]-'0';k--){
            if(li[k]>j){
                //swap
                char s = digits[j];
                digits[j]=digits[li[k]];
                digits[li[k]] = s;

                return Integer.parseInt(new String(digits));

            }
        }
      }
      return num;
     }

     public static void printArray(char[] nums){
        for(int i=0;i<nums.length;i++){
            System.out.println(nums[i]+" ");
        }
     }
}
