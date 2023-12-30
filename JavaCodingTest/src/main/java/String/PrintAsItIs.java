package String;

import java.util.Scanner;

public class PrintAsItIs {
    public static void main(String[] args) {
        /*
        11718 그대로 출력하기
        입력받은 그대로 출력하기
         */
        Scanner sc = new Scanner(System.in);
        while(sc.hasNext()){
            System.out.println(sc.nextLine());
        }
    }
}
