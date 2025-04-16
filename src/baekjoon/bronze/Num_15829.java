package baekjoon.bronze;

import java.io.*;

public class Num_15829 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int r = 31;
        int M = 1234567891;
        long result = 0;

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            int num = str.charAt(i) - 96;
            result = (result + (num * power(r, i, M)) % M) % M;  // ✅ 핵심 수정
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

    static long power(int r,int i, int M){
        if(i == 0) return 1;

        long half = power(r, i / 2, M);
        long result = (half * half) % M;

        if(i % 2 == 1) result = (result * r) % M;

        return result;
    }
}
