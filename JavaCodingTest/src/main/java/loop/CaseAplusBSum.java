package loop;

import java.util.Scanner;

public class CaseAplusBSum {
    public static void main(String[] args) {
        /*
        11022 A + B - 8
        A + B에 문자열 함께 출력
        */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.printf("Case #%d: %d + %d = %d\n", i + 1, A, B, (A + B));
        }
    }
}
