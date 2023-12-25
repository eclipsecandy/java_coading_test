package OneDimenArray;

import java.util.Scanner;

public class CountNum {
    public static void main(String[] args) {
        /*
        10807 개수세기
        주어진 정수의 개수 구하기
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = sc.nextInt();
        }
        int v = sc.nextInt();
        int sum = 0;
        for(int i = 0; i < N; i++) {
            if(v == arr[i]) sum++;
        }
        System.out.println(sum);
    }
}
