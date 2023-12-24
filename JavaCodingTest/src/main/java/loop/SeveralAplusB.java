package loop;

import java.util.Scanner;

public class SeveralAplusB {
    public static void main(String[] args) {
        /*
        10951 A + B - 4
        입력 받은 행의 값 합산
        */
        Scanner sc = new Scanner(System.in);
        /*
        while(true) {
            String[] str = sc.nextLine().split(" ");
            int A = Integer.parseInt(str[0]);
            int B = Integer.parseInt(str[1]);
            System.out.println(A + B);
            if(!sc.hasNext()) break;
        }
         */
        while(sc.hasNextInt()) {
            int A = sc.nextInt();
            int B = sc.nextInt();
            System.out.println(A + B);
        }
    }
}
