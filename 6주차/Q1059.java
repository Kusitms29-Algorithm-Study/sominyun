import java.util.Arrays;
import java.util.Scanner;


public class Q1059 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int L = scanner.nextInt(); //집합의 크기
        int[] array = new int[L+1]; //마지막 n도 넣어버림

        for (int i = 0; i < L+1; i++) {
            array[i] = scanner.nextInt();
        }
        int n = array[L]; //찾고자 하는 값

        // 배열 정렬
        Arrays.sort(array);

        // 특정 값의 인덱스 찾기
        int index = Arrays.binarySearch(array, n);
        if(array[index+1]==n){
            index++;
        }

        int count=0;
        for(int i=array[index-1]+1;i<=n;i++){
            for(int j=array[index+1]-1;j>i&&j>=n;j--){
                count++;
            }
        }
        System.out.print(count);
    }
}