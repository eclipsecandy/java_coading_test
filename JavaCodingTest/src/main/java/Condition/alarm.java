package Condition;

import java.util.Scanner;

public class alarm {
    public static void main(String[] args) {
        /*
        * 2884 알람시계
        * 45분 일찍 알람시계 설정하기
        */

        Scanner sc = new Scanner(System.in);
        int hour = sc.nextInt();
        int min = sc.nextInt();

        if(min < 45) {
            min = min + 60 - 45;
            hour = hour == 0 ? (hour + 24 - 1) : (hour - 1);
        } else {
            min = min - 45;
        }
        System.out.println(hour + " " + min);
    }
}
