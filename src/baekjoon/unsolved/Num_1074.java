package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1074 {
    public static void main(String[] args) throws IOException {
        /**
         * 00 01
         * 10 11
         *
         * 02 03
         * 12 13
         *
         * 배열을 만든다.
         *
         * 시작은 처음 2까지만 탐색하고
         * 내려가서 2까지 탐색
         *
         * 재귀
         *
         *
         */

        /**
         *1 이면 0에서 1 1에서 1까지
         * 2면 4개로 쪼개짐
         * 00에서 시작하는거
         *
         * 02에서 시작하는거
         * 20에서 시작하는거
         *
         * 22에서 시작하는거
         *
         *
         * 1= 1
         * 2 =4 2^2
         * 3 =16 2 ^3
         *
         * 2를 받으면 4번 호출
         * 3을 받으면 16번 호출 2를 4번
         * 4을 받으면 3을 4번
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
    }


}
