package baekjoon.silver;

import java.io.*;

public class Num_1436{
    public static void main(String[] args) throws IOException {
        /**
         * 666이 들어가야한다.
         * 666 1666 2666 .... 5666까지
         * 여기서 6660부터는 첫째 자리가 늘었으니 10개 더 생긴다 666+ 0 ~ 9까지
         * 만약 10에 자리면 100개
         *
         * 7부터 6660 1 2 3 4 5 6 7 8 9
         * 16
         *
         * 부루트 폭포스로 1부터 시작해서 666이 들어가면 +1해보자
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int noa =0;

        int i=0;
        while(!(i == N)){
            noa++;
            if(String.valueOf(noa).contains("666")){
                i++;
            }
        }

        bw.write(String.valueOf(noa));
        bw.flush();
        bw.close();
    }
}
