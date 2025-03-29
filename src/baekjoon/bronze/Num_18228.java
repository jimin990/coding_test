package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_18228 {
    public static void main(String[] args) throws IOException {
        /**
         * 배열에 넣고 펭권 위치부터 양쪽으로 작은 것을 찾고 더해준다.
         * 1. 재귀로 사용한다
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        long[] arr = new long[N];

        int penguin = 0;

        long min1 = Long.MAX_VALUE;
        long min2 = Long.MAX_VALUE;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Long.parseLong(st.nextToken());
            if(arr[i] == -1){
                penguin = i;
            }
        }

        for (int i = penguin+1; i < N; i++) {
            min1 = Math.min(arr[i], min1);
        }


        for (int i = penguin-1; i >= 0; i--) {
            min2 = Math.min(arr[i], min2);
        }

        bw.write(String.valueOf(min1 + min2));
        bw.flush();
        bw.close();
    }
}
