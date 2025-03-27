package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_16504 {
    public static void main(String[] args) throws IOException {
        /**
         * N은 2의 제곱
         * 4
         * 14
         * 23
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long result =0;

        StringTokenizer st;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < N; j++) {
                result += Integer.parseInt(st.nextToken());
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
