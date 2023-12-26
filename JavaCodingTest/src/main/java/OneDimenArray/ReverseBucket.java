package OneDimenArray;

import java.util.Arrays;
import java.util.Scanner;

public class ReverseBucket {
    public static void main(String[] args) {
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
