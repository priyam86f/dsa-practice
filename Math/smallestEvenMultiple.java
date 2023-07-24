public class smallestEvenMultiple {
    public static void main(String[] args) {
        int x = smallestMultiple(5);
        System.out.println(x);
    }

    public static int smallestMultiple(int n) {
        int x=0;
        int i=1;
       while(n>0){
           if(i%2==0 && i%n==0){
            x=i;
            break;
           }
           i++;
       }
       return x;
    }
}
