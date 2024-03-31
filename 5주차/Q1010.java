import java.math.BigInteger;
import java.util.Scanner;

public class Q1010 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        for(int i=0;i<n;i++){
            int a = scanner.nextInt();
            int b = scanner.nextInt();

            // bCa = b!/((b-a)!*a!)
            System.out.println(factorial(b).divide(factorial(b-a).multiply(factorial(a))));
        }
    }

    public static BigInteger factorial(int num){
        if(num<=1)
            return BigInteger.valueOf(1);
        else
            return BigInteger.valueOf(num).multiply(factorial(num-1));
    }
}