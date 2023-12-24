package Condition;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ThreeDice {
    public static void main(String[] args) throws IOException {
        /*
        * 2480 주사위 세개
        * 주사위 세 개 일치, 두 개 일치, 서로 다름에 따른 결과값
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split(" ");
        int[] iArr = new int[3];
        for(int i = 0; i < arr.length; i++) {
            iArr[i] = Integer.parseInt(arr[i]);
        }

        // int max = Arrays.stream(iArr).max().getAsInt();

        Arrays.sort(iArr);
        int max = iArr[iArr.length - 1];
        int mid = iArr[1];
        int min = iArr[0];

        int reward = 0;
        if(max == min) {
            reward = 10000 + (max * 1000);
        } else if(max == mid || mid == min) {
            reward = 1000 + (mid * 100);
        } else {
            reward = max * 100;
        }
        System.out.println(reward);
        br.close();
    }
}
