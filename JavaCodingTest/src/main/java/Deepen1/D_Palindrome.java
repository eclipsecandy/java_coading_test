package Deepen1;

import java.util.Scanner;

public class D_Palindrome {
    public static void main(String[] args) {
        /*
        10988 팰린드롬인지 확인하기
        level, noon과 같이 거꾸로 해도 같은 단어가 나오면 1, 아니면 0 출력
         */
        String str = new Scanner(System.in).nextLine();
        int result = 1;
        for(int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            result *= str.charAt(i) == str.charAt(j) ? 1 : 0;
        }
        System.out.println(result);
    }
}
