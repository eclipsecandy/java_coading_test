package Deepen1;

import java.util.Arrays;
import java.util.Scanner;

public class E_WordStudy {
    public static void main(String[] args) {
        /*
        1157 단어 공부
        가장 많이 나온 알파벳 대문자로 출력
         */
        // 메모리 초과
        String str = new Scanner(System.in).nextLine();
        int[] arr = new int[26];
        for(int i = 0; i < str.length(); i++) {
            arr[str.toUpperCase().charAt(i) - 65]++;
        }
        /*
        char max = 'A';
        for(int i = 0; i < arr.length - 1; i++) {
            if(arr[i] < arr[i + 1]) {
                max = (char)(i + 1 + 65);
            }
        }
        for(int i = 0; i < arr.length; i++) {
            if(arr[max - 65] == arr[i] && max - 65 != i) {
                max = '?';
                break;
            }
        }
        System.out.println(max);
         */
        int max = Arrays.stream(arr).max().orElse(0); // 4
        char alpa = 'A';
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == max) {
                alpa = (char)(i + 65);
                break;
            }
            /*
            for(int j = 0; j < arr.length; j++){
                if(alpa == (char)(j + 65) && i != j) alpa = '?';
                break;
            }
             */
        }
        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == max && i + 65 != alpa) {
                alpa = '?';
                break;
            }
        }
        System.out.println(alpa);
    }
}
