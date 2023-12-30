package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class NumOfWords {
    public static void main(String[] args) {
        /*
        1152 단어의 개수
        문자열의 단어 개수 구하기
         */
        StringTokenizer st = new StringTokenizer(new Scanner(System.in).nextLine(), " ");
        System.out.println(st.countTokens());
    }
}
