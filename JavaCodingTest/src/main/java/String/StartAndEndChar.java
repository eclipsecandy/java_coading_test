package String;

import java.util.Scanner;

public class StartAndEndChar {
    public static void main(String[] args) {
        /*
        9086 문자열
        문자열 첫 글자와 마지막 글자 출력
         */
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        String[] str = new String[T];
        for(int i = 0; i < str.length; i++) {
            str[i] = sc.nextLine();
            System.out.println("" + str[i].charAt(0) + str[i].charAt(str[i].length() - 1));
        }
    }
}
