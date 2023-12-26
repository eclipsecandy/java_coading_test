package OneDimenArray;

import java.util.Scanner;

public class SwitchBalls {
    public static void main(String[] args) {
        /*
        10813 공 바꾸기
        두 수의 바구니 공 바꾸기
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int[] arr = new int[N];
        for(int a = 0; a < arr.length; a++) {
            arr[a] = a + 1;
        }
        for(int a = 0; a < M; a++) {
            int i = sc.nextInt();
            int y = sc.nextInt();
            int temp = arr[i - 1];
            arr[i - 1] = arr[y - 1];
            arr[y - 1] = temp;
        }
        for(int a : arr) {
            System.out.print(a + " ");
        }
    }
}
