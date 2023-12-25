package loop;

import java.util.Scanner;

public class star {
    public static void main(String[] args) {
        // 2438 별 찍기 -1
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < N; i++) {
            sb.append("*");
            System.out.println(sb.toString());
        }
    }
}
