package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_28295 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 1 이면 우향우
         * 2이면 뒤로 돌아
         * 3면 좌향좌
         *
         * 0 정면
         * 1 우
         * 2 뒤
         * 3 좌
         *
         * 뒤로 돌아 하면 2를 빼기
         * 우로 하면 1더하기
         * 좌 하면 -1 빼기
         *
         * 3인데 우 하면 0으로
         * 우 인데 뒤로 돌아하면 좌로
         * 정면인데 뒤로 돌아하면 2로
         *
         * 정면인데 좌 하면 3으로
         *
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int position = 0;

        //북쪽이라면 N, 동쪽이라면 E, 서쪽이라면 W, 남쪽이라면 S를 출력한다.
        String[] news = {"N","E","S","W"};

        for (int i = 0; i < 10; i++) {
            int d = Integer.parseInt(br.readLine());

            if(position == 0){
                if(d == 1){
                    position=1;
                }else if(d == 2){
                    position=2;
                }else{
                    position=3;
                }

            }else if (position == 1) {
                if(d == 1){
                    position=2;
                }else if(d == 2){
                    position=3;
                }else{
                    position=0;
                }

            }else if (position == 2) {
                if(d == 1){
                    position=3;
                }else if(d == 2){
                    position=0;
                }else{
                    position=1;
                }
            }else if (position == 3) {
                if(d == 1){
                    position=0;
                }else if(d == 2){
                    position=1;
                }else{
                    position=2;
                }
            }


        }
        System.out.println(news[position]);
    }
}
