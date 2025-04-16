package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        int max = Integer.MIN_VALUE;
        float result = 0;
        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());

            max = Math.max(max, arr[i]);
        }

        for (int i = 0; i < N; i++) {
            result += ((float) arr[i] / max) * 100;
        }

        bw.write(String.valueOf(result/N));
        bw.flush();
        bw.close();
    }
}
