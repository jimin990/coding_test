package baekjoon.bronze;

import java.io.*;
import java.math.BigInteger;

public class Num_4150 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        if (N == 1 || N == 2) {
            bw.write("1");
            bw.flush();
            bw.close();
        }else {
            BigInteger[] arr = new BigInteger[N + 1];

            arr[1] = new BigInteger("1");
            arr[2] = new BigInteger("1");
            for (int i = 3; i <= N; i++) {
                arr[i] = arr[i - 1].add(arr[i - 2]);
            }

            bw.write(String.valueOf(arr[N]));
            bw.flush();
            bw.close();
        }
    }
}
