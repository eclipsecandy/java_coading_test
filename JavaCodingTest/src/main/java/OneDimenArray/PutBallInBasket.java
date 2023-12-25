package OneDimenArray;

import java.util.Scanner;

public class PutBallInBasket {
    public static void main(String[] args) {
        /*
        10810 공 넣기
        N개 바구니에 M회 공 넣기
        기존의 공은 제거하고, i ~ j까지의 바구니에 k번 공 넣기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int x = 0; x < M; x++) {
            int i = sc.nextInt();
            int j = sc.nextInt();
            int k = sc.nextInt();
            for(int y = i - 1; y < j; y++) {
                arr[y] = k;
            }
        }
        for(int i = 0; i < N; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
