package Condition;

import java.util.Scanner;

public class Quardrant {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int result = x > 0 ? (y > 0 ? 1 : 4) : (y > 0 ? 2 : 3);

        System.out.println(result);
    }
}
