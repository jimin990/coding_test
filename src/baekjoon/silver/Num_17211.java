package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_17211 {
    public static void main(String[] args) throws IOException {

        /**
         * N 과 오늘의 기분 0 좋음 1 나쁨 입력
         * 이 후 4가지 입력을 받음
         * 1. 기분이 좋은 날에서 좋은날
         * 2. 기분이 좋을 날에서 싫은 날
         * 3. 기분이 싫은 날에서 기분이 좋은날
         * 4. 기분이 싫은 날에서 기분이 싫은날
         *
         * 처음이 기분이 나쁜날로 0.5고정
         *
         * 2번째 날부터
         *
         * 기분이 좋아질 확률 = 전날 좋은 기분 확률 X 다음날 기분 좋아질 확률  + 전날 나쁜확률 X 그 다음날 기분이 좋아질 확률
         *
         * 좋은 날 2: 3 X 1 + 4 X 3
         * 좋은 날 3: 좋은 날 2 X 1 + 싫은날 2 X 3
         *
         * 싫은 날 2: 3 x 2 + 4 x 4
         * 싫은 날 3: 좋은날 X 2 + 싫은날 x 4
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str1 = br.readLine().split(" ");

        int N = Integer.parseInt(str1[0]);
        int today = Integer.parseInt(str1[1]);

        String[] str2 = br.readLine().split(" ");
        float[] emo = new float[4];


        for (int i = 0; i < 4; i++) {
            emo[i] = Float.parseFloat(str2[i]);
        }

        float good = 1;
        float bad = 1;

        if (today == 0) {
            good *= emo[0];
            bad *= emo[1];
        }else{
            good *= emo[2];
            bad *= emo[3];
        }


        for (int i = 1; i < N; i++) {

            float good1 = good * emo[0] + bad * emo[2];
            float bad1 = good*emo[1] + bad *emo[3];

            good = good1;
            bad = bad1;
        }

        System.out.printf("%.0f\n",good*1000);
        System.out.printf("%.0f",bad*1000);
    }
}
