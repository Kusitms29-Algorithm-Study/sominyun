import java.util.Scanner;

public class Q1094 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        String b = Integer.toBinaryString(n);
        int[] binary = new int[2];

        for(int i=0;i<b.length();i++){
            binary[b.charAt(i)-'0']++;
        }
        System.out.print(binary[1]);
    }
}
