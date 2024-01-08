package Deepen1;

import java.util.Scanner;

public class F_Croatia {
    public static void main(String[] args) {
        /*
        2941 크로아티아 알파벳
        문자열이 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
         */
        String str = new Scanner(System.in).nextLine();
        int sum = 0;
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        for(int i = 0; i < arr.length; i++){
            if(str.contains(arr[i])){
                str.substring(str.indexOf(arr[i]), 3);
                System.out.println(str.indexOf(arr[i]));
            }
        }


        System.out.println(str.contains("abc"));
    }
}
