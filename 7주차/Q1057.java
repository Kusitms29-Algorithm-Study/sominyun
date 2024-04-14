import java.util.Scanner;


public class Q1057 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int num = scanner.nextInt(); //총 인원수
        int p1 = scanner.nextInt();
        int p2 = scanner.nextInt();

        int count=1;

        for (int i = num; i >= 2; i = i / 2 + i % 2) {
            if(next(p1)==next(p2)){
                System.out.print(count);
                break;
            }else{
                p1=next(p1);
                p2=next(p2);
                count++;
            }
        }
    }

    public static int next(int r) {
        return r / 2 + r % 2;
    }
}