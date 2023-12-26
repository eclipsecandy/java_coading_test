package OneDimenArray;

import java.util.Scanner;

public class FakeAverage {
    public static void main(String[] args) {
        /*
        1546 평균
        기말고사 점수 최대값을 대비하여 새로운 평균값 구하기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        int max = 0;
        for(int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
            if(arr[i] > max) {
                max = arr[i];
            }
        }
        double sum = 0.0;
        double[] dArr = new double[arr.length];
        for(int i = 0; i < arr.length; i++) {
            dArr[i] = (double)arr[i] / max * 100;
            sum += dArr[i];
        }
        System.out.println(sum / arr.length);
    }
}
