package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_25425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long N = Long.parseLong(st.nextToken()); // N 팀
        long M = Long.parseLong(st.nextToken()); // M명의 인원
        long a = Long.parseLong(st.nextToken()); //  남은 인원 a
        long K = Long.parseLong(st.nextToken()); // 준혁이 팀 남은 인원 K명

        long max = Math.min(N, a-K+1);  // 전체 팀 수보다 많을 수는 없음

       long min = (long) Math.ceil((double) (a - K) / M) + 1;


        bw.write(String.valueOf(max));
        bw.write(" ");
        bw.write(String.valueOf(min));

        bw.flush();
        bw.close();
    }
}
