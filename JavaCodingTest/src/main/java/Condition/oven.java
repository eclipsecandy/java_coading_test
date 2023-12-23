package Condition;

import java.util.Scanner;
import java.util.StringTokenizer;

public class oven {
    public static void main(String[] args) {
        /*
        * 2525 오븐 시계
        * 요리 시간에 맞게 자동 시간 설정
         */
        Scanner sc = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
        int hour = Integer.parseInt(st.nextToken());
        int min = Integer.parseInt(st.nextToken());
        int time = sc.nextInt();

        hour = hour + (time / 60);
        min = min + (time % 60);

        if(min >= 60) {
            hour++;
            min -= 60;
        }

        hour = hour >= 24 ? hour - 24 : hour;

        System.out.println(hour + " " + min);

    }

}
