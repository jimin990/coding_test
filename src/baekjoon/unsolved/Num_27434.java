package baekjoon.unsolved;

import java.io.*;
import java.math.BigInteger;

public class Num_27434 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        BigInteger result = new BigInteger(String.valueOf(1));

        for (int i = N; i > 0; i--) {
            BigInteger multiply = result.multiply(BigInteger.valueOf(i));
            result = multiply;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
