package loop;

import java.util.Scanner;

public class PhysicalEdu {
    public static void main(String[] args) {
        // 25314
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        StringBuilder sb = new StringBuilder("int");

        int loop = N / 4;
        while(true) {
            sb.insert(0, "long ");
            if(0 == --loop) break;
        }
        System.out.println(sb.toString());
    }
}
