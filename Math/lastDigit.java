import java.math.BigInteger;
public class lastDigit {
    public static void main(String[] args) {
        String A = "0174520669358005603046598506479720736793297760682474223148909553942090532954907781068677982335584824";
        String B = "5421158054975868127102040792138616334158595194152449113616682432094194180103217434896269284568749648";
        
        int result = last(A, B);
        System.out.println("Result: " + result);
        
    }




public static int last(String A, String B) {
    BigInteger a = new BigInteger(A);
    BigInteger b = new BigInteger(B);

    BigInteger c = a.modPow(b, BigInteger.TEN);

    return c.intValue();
}

}
