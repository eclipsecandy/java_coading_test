package String;

import java.util.Scanner;

public class SangSoo {
    public static void main(String[] args) {
        /*
        2908 상수
        세자리 숫자를 거꾸로 읽어 두 수 대소비교
         */
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        StringBuilder sba = new StringBuilder();
        StringBuilder sbb = new StringBuilder();
        for(int i = 0; i < A.length(); i++) {
            sba.insert(0, A.charAt(i));
            sbb.insert(0, B.charAt(i));
        }
        int a = Integer.parseInt(sba.toString());
        int b = Integer.parseInt(sbb.toString());
        int result = a > b ? a : b;
        System.out.println(result);
    }
}
