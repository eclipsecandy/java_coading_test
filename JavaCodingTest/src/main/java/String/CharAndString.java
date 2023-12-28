package String;

import java.util.Scanner;

public class CharAndString {
    public static void main(String[] args) {
        /*
        27866 문자와 문자열
        문자열 S의 i번째 문자 출력
         */
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();
        int i = sc.nextInt();
        System.out.println(S.charAt(i - 1));

    }
}
