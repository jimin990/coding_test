package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_14724 {
    public static void main(String[] args) throws IOException {
        /**
         * 처음 동아 회원 N을 받는다
         * 리더로 받고 가장 큰 숫자와 그 숫자의 동아리 번호를 저장
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        String[] club = {"PROBRAIN", "GROW", "ARGOS", "ADMIN", "ANT", "MOTION", "SPG", "COMON", "ALMIGHTY"};

        int max =0;
        int maxT =0;

        for (int i = 0; i < 9; i++) {

            String[] str = br.readLine().split(" ");

            for (int j = 0; j < T; j++) {
                int cmp = Integer.parseInt(str[j]);
                if (cmp > max) {
                    max = cmp;
                    maxT = i;
                }
            }
        }

        System.out.println(club[maxT]);

    }
}
