package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_14724 {
    public static void main(String[] args) throws IOException {
        /**
         * 처음 동아 회원 N을 받는다
         * 리더로 받고 가장 큰 숫자와 그 숫자의 동아리 번호를 저장
         *
         * 1.PROBRAIN,
         * 2.GROW,
         * 3.ARGOS,
         * 4.ADMIN,
         * 5.ANT,
         * 6.MOTION,
         * 7.SPG,
         * 8.COMON,
         * 9.ALMIGHTY
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;

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


        switch(maxT){
            case 0:
                System.out.println("PROBRAIN");
                break;
            case 1:
                System.out.println("GROW");
                break;
            case 2:
                System.out.println("ARGOS");
                break;
            case 3:
                System.out.println("ADMIN");
                break;
            case 4:
                System.out.println("ANT");
                break;
            case 5:
                System.out.println("MOTION");
                break;
            case 6:
                System.out.println("SPG");
                break;
            case 7:
                System.out.println("COMON");
                break;
            case 8:
                System.out.println("ALMIGHTY");
                break;
        }

    }
}
