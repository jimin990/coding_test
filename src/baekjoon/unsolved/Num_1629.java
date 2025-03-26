package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1629 {
    public static void main(String[] args) throws IOException {

        /**
         *
         * A를 B번 곱하기에는 시간제한이 안됨
         * A의 계산 횟수를 줄여야한다.
         *
         * 분할 정볻을 통해 풀자
         * 분할 정복이란?
         *
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());


        long A = Long.parseLong(st.nextToken());
        long B = Long.parseLong(st.nextToken());
        long C = Long.parseLong(st.nextToken());;

        long separate = separate(A, B, C);
        bw.write(String.valueOf(separate));
        bw.flush();
        bw.close();

    }

    public static long separate(long A, long B, long C){
        if(B == 1){
            return A%C;
        }

        if (B % 2 == 0) {
            long separate1 = separate(A, B / 2, C);
            return (separate1 * separate1) % C;
        }else {
            long separate1 = separate(A, B / 2, C);
            long separate2 = separate(A, B %2, C);
            return (separate1 * separate1 * separate2) % C;
        }

    }
}
