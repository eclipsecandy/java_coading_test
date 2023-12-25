package loop;

import java.util.Scanner;

public class CaseAplusB {
    public static void main(String[] args) {
        /*
        11021 A + B - 7
        A + B출력에 문자열 추가하기
        */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            sb.append("Case #" + (i + 1) + ": " + (A + B) + "\n");
        }
        System.out.println(sb.toString());
    }
}
