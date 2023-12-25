package loop;

import java.util.Scanner;

public class AplusBExceptLast {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(sc.hasNextInt()) {
            int sum = sc.nextInt() + sc.nextInt();
            if(sum == 0) break;
            System.out.println(sum);
        }
        sc.close();
    }
}
