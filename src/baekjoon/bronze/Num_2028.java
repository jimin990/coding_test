package baekjoon.bronze;

import java.io.*;

public class Num_2028 {
    public static void main(String[] args) throws IOException {
        /**
         * String 으로 받고 길이 측정하고, long으로 바꾸고 다시 그거 String으로 바꾸고 길이까지만 측정
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String N = br.readLine();
            ;
            String pow = String.valueOf((int)Math.pow(Long.parseLong(N), 2));

            String substring = pow.substring(pow.length() - N.length());

            if (substring.equals(N)) {
                bw.write("YES");
            } else bw.write("NO");

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
