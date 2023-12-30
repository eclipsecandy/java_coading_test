package Deepen1;

import java.util.Scanner;

public class B_ChessPiece {
    public static void main(String[] args) {
        /*
        3003 킹, 퀸, 룩, 비숍, 나이트, 폰
        각 피스의 부족한 개수 구하기
         */
        Scanner sc = new Scanner(System.in);
        int[] nomal = {1, 1, 2, 2, 2, 8};
        for(int i = 0; i < 6; i++) {
            System.out.print(nomal[i] - sc.nextInt() + " ");
        }
    }
}
