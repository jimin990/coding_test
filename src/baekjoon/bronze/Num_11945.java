package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_11945 {
    public static void main(String[] args) throws IOException {
        /**
         * 입력을 받고 거꾸로 출력
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        for (int i = 0; i < N; i++) {

            StringBuilder sb = new StringBuilder(br.readLine());
            bw.write(String.valueOf(sb.reverse()));
            bw.newLine();

        }

        bw.flush();
        bw.close();
    }
}
