package baekjoon.bronze;

import java.io.*;

public class Num_8393 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int sum =0;
        for (int i = 0; i <= N; i++) {
            sum += i;
        }

        bw.write(String.valueOf(sum));
        bw.flush();
        bw.close();
    }
}
