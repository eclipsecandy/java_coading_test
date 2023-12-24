package loop;

import java.util.Scanner;

public class receipt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long X = sc.nextLong();
        int N = sc.nextInt();
        int total = 0;
        for(int i = 0; i < N; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            total += a * b;
        }
        String result = X == total ? "Yes" : "No";
        System.out.println(result);
    }
}
