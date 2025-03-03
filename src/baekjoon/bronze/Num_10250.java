package baekjoon.bronze;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.io.BufferedReader;

public class Num_10250 {
    public static void main(String[] args) throws IOException {
        /**
         * 결국은 각 층의 처음 방이 나가고 그 다음 방들이 나간다.
         *
         * H 층
         * W 각 층의 방 개수
         * 301 302
         * 30 50 72
         *
         * 1203
         *
         *
         * 방이 for 밖
         * 층이 안쪽
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());


        for (int i = 0; i < T; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int H = Integer.parseInt(st.nextToken());
            int W = Integer.parseInt(st.nextToken());
            int N = Integer.parseInt(st.nextToken());

            int count =0;
            for (int j = 1; j <= W; j++) {
                for (int k = 1; k <= H; k++) {
                    count++;

                    if (count == N) {
                        System.out.printf("%d%02d",k,j);
                        System.out.println();
                    }
                }
            }

        }
    }
}