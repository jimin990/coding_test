package baekjoon.silver;

import java.io.*;
import java.math.BigInteger;

public class Num_13909 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());


        BigInteger big = new BigInteger(String.valueOf(N));
        bw.write(String.valueOf(big.sqrt()));
        bw.flush();
        bw.close();

    }
}
