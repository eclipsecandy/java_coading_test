package OneDimenArray;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*
        5597 과제 안 내신 분..?
        30명 중 과제 안한 두명 찾기
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[28];
        for(int i = 0; i < 28; i++) {
            arr[i] = sc.nextInt();
        }
        Arrays.sort(arr);
        int[] sub = new int[2];
        for(int i = 0; i < 28; i++) {
            if(arr[i] != i + 1) {
                sub[0] = i + 1;
                break;
            }
        }
        if(sub[0] == 0) sub[0] = 29;
        for(int i = sub[0] - 1; i < 28; i++) {
            if(arr[i] != i + 2) {
                sub[1] = i + 2;
                break;
            }
        }
        if(sub[1] == 0) sub[1] = 30;
        System.out.println(sub[0]);
        System.out.println(sub[1]);
    }
}
