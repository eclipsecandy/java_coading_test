package OneDimenArray;

import java.util.Scanner;

public class ReverseBucket {
    public static void main(String[] args) {
        /*
        10811 바구니 뒤집기
        N개의 바구니를 M번 역순으로 만들기
        한 번 뒤집을 때 i ~ j까지 역순으로 만들기
         */
        Scanner sc = new Scanner(System.in);
        int busketNum = sc.nextInt();
        int repeat = sc.nextInt();
        int[] arr = new int[busketNum];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
        for(int i = 0; i < repeat; i++) {
            int start = sc.nextInt();
            int end = sc.nextInt();
            for(int j = start - 1, k = end - 1; j < k; j++, k--) {
                int temp = arr[j];
                arr[j] = arr[k];
                arr[k] = temp;
            }
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
