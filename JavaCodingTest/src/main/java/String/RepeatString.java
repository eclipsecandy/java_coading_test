package String;

import java.util.Scanner;
import java.util.StringTokenizer;

public class RepeatString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());
        for(int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(sc.nextLine(), " ");
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for(int k = 0; k < S.length(); k++) {
                for(int j = 0; j < R; j++) {
                    System.out.print(S.charAt(k));
                }
            }
            System.out.println();
        }
    }
}
