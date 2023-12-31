package OneDimenArray;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class MinAndMax {
    public static void main(String[] args) {
        /*
        10818 최소 최대
        정수 배열의 최소, 최대값 구하기
         */
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        sc.nextLine();
        String str = sc.nextLine();
        StringTokenizer st = new StringTokenizer(str, " ");
        int[] arr = new int[N];
        for(int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(arr);
        System.out.println(arr[0] + " " + arr[arr.length - 1]);
    }
}
