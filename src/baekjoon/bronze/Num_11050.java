package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_11050 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        int sum =1;
        for (int i = N-K+1; i <= N; i++) {
            sum*=i;
        }

        for (int i = 1; i <=K; i++) {
            sum/=i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
