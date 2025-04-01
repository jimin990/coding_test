package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_14652 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int n = -1;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                n++;
                if (n == K) {
                    bw.write(String.valueOf(i));
                    bw.write(" ");
                    bw.write(String.valueOf(j));
                    bw.flush();
                    bw.close();
                    return;
                }
            }
        }

    }
}
