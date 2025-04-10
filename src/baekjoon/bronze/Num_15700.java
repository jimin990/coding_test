package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_15700 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        //실패한 코드
        //int result = ( N * M) / 2;
        long result = ((long) N * M) / 2;

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
