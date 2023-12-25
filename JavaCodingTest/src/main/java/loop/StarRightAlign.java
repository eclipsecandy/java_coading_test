package loop;

import java.util.Scanner;

public class StarRightAlign {
    public static void main(String[] args) {
        /*
        2439 별 찍기 - 2
        별 찍고 오른쪽 정렬
        */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        int M = N;
        for(int i = 0; i < N; i++) {
            sb.append("*");
            StringBuilder sp = new StringBuilder();
            for(int j = 1; j< M; j++) {
                sp.append(" ");
            }
            M--;
            System.out.println(sp.toString() + sb.toString());
            // System.out.println(String.format("%5s", sb.toString()));
        }
    }
}
