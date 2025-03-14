package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_11109 {
    public static void main(String[] args) throws IOException {
        /**
         * T 테스트 케이스
         *
         * d 병렬 버전을 개발하는 걸리는 시간
         * n 이 프로그램이 실행되는 횟수
         * s 직렬 프로그램 실행 시간
         * p 병렬 프로그램 실행 시간
         *
         * n * s 가 직렬 총 시간
         * d +  n * p 가 병렬 시간
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for(int i =0;i<T;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int d = Integer.parseInt(st.nextToken());
            int n = Integer.parseInt(st.nextToken());
            int s = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            int nPal = n * s;
            int pal = d + n * p;

            if(nPal == pal){
                bw.write("does not matter");
            }else if(nPal > pal){
                bw.write("parallelize");
            }else bw.write("do not parallelize");

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
