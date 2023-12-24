package loop;

import java.io.*;

public class FastSum {
    public static void main(String[] args) throws IOException {
        // 15552
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.valueOf(br.readLine());
        while(true) {
            if(0 == T--) break;
            String[] str = br.readLine().split(" ");
            int A = Integer.valueOf(str[0]);
            int B = Integer.valueOf(str[1]);
            bw.write(String.valueOf(A + B) + "\n");
        }
        br.close();
        bw.flush();
        bw.close();
    }
}
