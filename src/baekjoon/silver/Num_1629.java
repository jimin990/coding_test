package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1629 {
    public static void main(String[] args) throws IOException {
        /**
         *
         *A를 B번 곱한 값
         *
         * A^B mod C
         *
         * A의 B승은 엄청난 무한의 수
         * A^B = A^2/B * A^2/B
         * int
         * B를 B/2하면서 재귀
         * 만약 나누어 안떨어지면 b/2 b/2+1
         * 종료 조건 B = 1일때
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        bw.write(String.valueOf(recrusion(A, B, C)));
        bw.flush();
        bw.close();
    }

    static long recrusion(int A, int B, int C) {

        if (B == 1) {
            return A % C;
        }

        long re = recrusion(A, B / 2, C);
        re = re * re % C;

        if (B % 2 == 0) {
            return re;
        } else {
            return (re * A) % C;
        }

    }
}
