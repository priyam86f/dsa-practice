public class twentyfivepercent {
    public static void main(String[] args) {
        int[] nums = {1,1,1,1,2,2,2,3,3,4};
        int ans = twenty_five_percent_occurence(nums);
        System.out.println(ans);
    }


    public static int twenty_five_percent_occurence(int[] arr){
        int sol = 0;
        int quarter = 25/100;
        int p=arr[0];
        int ctr=0;

        for(int i=0;i<arr.length;i++){
            if(p==arr[i]){
                ctr++;
            }else{
                ctr=1;
            }
            if(ctr  >  quarter){
                return arr[i];
            }

            p=arr[i];
        }

        return p;
    }
}
