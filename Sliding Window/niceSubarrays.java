public class niceSubarrays{
    public static void main(String[] args) {
        int[] arr = {1,1,2,1,1};
        int k=3;
        int res = numberOfSubarrays(arr, k);
        System.out.println(res);
    }

    public static int numberOfSubarrays(int[] nums, int k) {
        int l=0;
        int m=l;
        int res=0;
        int odd=0;

        for(int r=0;r<nums.length;r++){
            if(nums[r]%2!=0){
                odd++;
            }
            while(odd>k){
                if(nums[l]%2!=0){
                    odd--;
                }
                l++;
                m=l;
            }
            if(odd==k){
                while(nums[m]%2==0){
                    m++;
                }
                res+=(m-l)+1;
            }
        }
        return res;
    }
}