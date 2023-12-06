public class gaussSum {
   public static void main(String[] args) {
    int result = totalMoney(18);
    System.out.println(result);
   }
   
   public static int totalMoney(int n) {
    int weeks = n/7;
    int low = 28;
    int high = 28 + 7*(weeks-1);
    int res = (weeks * (low + high)) / 2;

    //leftover days
    int monday = weeks+1;
    for(int i=0;i<n%7;i++){
        res+=monday+i;
    }
    return res;
}
}
