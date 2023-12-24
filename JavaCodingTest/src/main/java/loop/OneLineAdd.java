package loop;

import java.util.Scanner;

public class OneLineAdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        sc.nextLine();
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < T; i++) {
            String[] str = sc.nextLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            sb.append(A + B + "\n");
        }
        System.out.println(sb.toString());
    }
}
