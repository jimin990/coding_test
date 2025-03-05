package baekjoon.bronze;

import java.io.*;

public class Num_2480 {
    public static void main(String[] args) throws IOException {
        /**
         * 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다.
         * 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다.
         * 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.
         *
         * 01 02 12 비교해서 3이면 다같음 1이상이면 2개 같음 0이면 다름
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);
        int C = Integer.parseInt(str[2]);

        int i =0;
        int equl =0;

        if(A == C) {
            i++;
            equl=Math.max(equl,A);
        }

        if(A == B) {
            i++;
            equl=Math.max(equl,A);
        }


        if(B == C) {
            i++;
            equl=Math.max(equl,B);
        }

        if(i==3){
            bw.write(String.valueOf(10000 + (1000 * equl)));
        }else if(i>0){
            bw.write(String.valueOf(1000 + (100 * equl)));
        }else bw.write(String.valueOf(100 * Math.max(A,Math.max(B,C))));

        bw.flush();
        bw.newLine();
    }
}
