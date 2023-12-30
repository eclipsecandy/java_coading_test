package String;

import java.util.Scanner;

public class Dial {
    public static void main(String[] args) {
        /*
        5622 다이얼
        1은 2초, 나머지는 + 1초씩 증가
        ABC는 2, DEF는 3, GHI는 4, ... WXYZ는 9
         */
        String str = new Scanner(System.in).nextLine();
        int result = 0;

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == 83) result += 8;
            else if(str.charAt(i) == 86) result += 9;
            else if(str.charAt(i) > 88 ) result += 10;
            else result += (str.charAt(i) - 65) / 3 + 3;
        }
        /*
        switch도 괜찮네
        for(int i = 0; i < str.length(); i++) {
            switch (str.charAt(i)) {
                case 'A' : case 'B' : case 'C' : result += 3; break;
            }
        }
        */
        System.out.println(result);

        /*
        65 66 67 : 3
        68 69 70 : 4
        71 72 73 : 5
        74 75 76 : 6
        77 78 79 : 7
        80 81 82 83 : 8
        15 16 17 ★18
        84 85 86 : 9
        19 20 ★21
        87 88 89 90 : 10
        22 23 ★24 ★25
         */
    }
}
