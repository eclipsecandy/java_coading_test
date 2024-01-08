package Deepen1;

import java.util.Scanner;

public class F_Croatia {
    public static void main(String[] args) {
        /*
        2941 크로아티아 알파벳
        문자열이 몇 개의 크로아티아 알파벳으로 이루어져 있는지 출력
         */
        String str = new Scanner(System.in).nextLine();
        String[] arr = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        /*
        int sum = 0;
        int length = str.length();
        for(int i = 0; i < arr.length; i++){
            if(str.contains(arr[i])){
                if(arr[i].equals("z=") && str.indexOf(arr[i]) == str.indexOf("dz=") + 1){
                    continue;
                }
                sum++;
                length -= arr[i].length();
            }
        }
        System.out.println(sum + length);
         */
        for(int i = 0; i < arr.length; i++){
            if(str.contains(arr[i])){
                str = str.replaceAll(arr[i], "!");
            }
        }
        System.out.println(str.length());
    }
}
