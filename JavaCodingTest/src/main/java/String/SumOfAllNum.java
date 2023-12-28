package String;

import java.io.*;

public class SumOfAllNum {
    public static void main(String[] args) throws IOException {
        /*
        11720 숫자의 합
        N개의 숫자 합
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;
        for(int i = 0; i < N; i++) {
            result += Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        System.out.println(result);
        bw.flush();
        br.close();
        bw.close();
    }
}
