package Deepen1;

import java.util.Scanner;

public class C_StarRule {
    public static void main(String[] args) {
        /*
        2444 별 찍기
        규칙에 맞게 별 찍기 2N - 1개씩 중앙정렬 별 찍기
         */
        // 방법1
        int N = new Scanner(System.in).nextInt();
        int line = 2 * N - 1;
        String[] arr = new String[line];
        for(int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = N; j > 0; j--) {
                sb.append(i < j - 1? " " : "*");
            }
            for(int j = 0; j < i; j++) {
                sb.append("*");
            }
            arr[i] = sb.toString();
            arr[line - i - 1] = sb.toString();
        }
        for(int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        /*
        // 방법2 채점은 안됨
        int N = new Scanner(System.in).nextInt();
        int line = 2 * N - 1;
        for(int i = 0; i < line; i++) {
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < line; j++) {
                int a = Math.abs(i - line / 2);
                sb.append((a <= j && j <= line / 2 * 2 - a) ? "*" : " ");
            }
            System.out.println(sb.toString());
        }
         */
        /*
        line / 2 == 4
        abs(i - line / 2) <= j <= line/ 2 * 2 - abs(i - line / 2)
        0 : 4 <= j <= 4
        1 : 3 <= j <= 5
        2 : 2 <= j <= 6
        3 : 1 <= j <= 7
        4 : 0 <= j <= 8
        5 : 1 <= j <= 7
        6 : 2 <= j <= 6
         */

    }
}
