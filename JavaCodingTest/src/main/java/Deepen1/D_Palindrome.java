package Deepen1;

import java.util.Scanner;

public class D_Palindrome {
    public static void main(String[] args) {
        String str = new Scanner(System.in).nextLine();
        int result = 1;
        for(int i = 0, j = str.length() - 1; i < str.length(); i++, j--) {
            result *= str.charAt(i) == str.charAt(j) ? 1 : 0;
        }
        System.out.println(result);
    }
}
