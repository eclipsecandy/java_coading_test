package OneDimenArray;

import java.util.Arrays;
import java.util.Scanner;

public class Remainder {
    public static void main(String[] args) {
        /*
        3052 나머지
        10개의 숫자를 42로 나눈 나머지의 총 개수
         */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[10];
        int sum = arr.length;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt() % 42;
        }
        for(int i = 0; i < arr.length; i++) {
            for(int j  = i + 1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    sum--;
                    break;
                }
            }
        }
        System.out.println(sum);
    }
}
