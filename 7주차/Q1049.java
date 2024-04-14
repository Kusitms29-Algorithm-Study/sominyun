import java.util.Scanner;


public class Q1049 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);

        int N = scanner.nextInt(); //끊어진 기타 줄 수
        int M = scanner.nextInt(); //브랜드 개수

        int set;
        int one;

        int sum=0;

        int min_set=Integer.MAX_VALUE;
        int min_one=Integer.MAX_VALUE;

        for(int i=0;i<M;i++){
            set=scanner.nextInt();
            one=scanner.nextInt();
            if(set<min_set)
                min_set=set;
            if(one<min_one)
                min_one=one;
        }

        int n=N/6; //세트
        int k=N%6; //낱개

        if(min_set<=min_one*6){ // 세트개 살때
            sum+= min_set*n;
        }else if(min_set>min_one*6){
            sum+=min_one*6*n;
        }

        if(min_set<=min_one*k){ //낱개 살 때
            sum+= min_set;
        }else if(min_set>min_one*k){
            sum+=min_one*k;
        }

        System.out.print(sum);
    }
}