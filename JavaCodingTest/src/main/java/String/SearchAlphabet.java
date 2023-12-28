package String;

import java.util.Arrays;
import java.util.Scanner;

public class SearchAlphabet {
    public static void main(String[] args) {
        /*
        10809 알파벳 찾기
        특정 알파벳이 포함되어 있으면 위치를, 없으면 -1 출력
         */
        String str = new Scanner(System.in).nextLine();
        int[] arr = new int[26];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = -1;
        }
        for(int i = str.length() - 1; i >= 0; i--) {
            int j = -1;
            while(j++ < 26) {
                if(str.charAt(i) - 97 == (char)j){
                    arr[j] = i;
                    break;
                }
            }
        }
        for(int i : arr) {
            System.out.print(i + " ");
        }
    }
}
