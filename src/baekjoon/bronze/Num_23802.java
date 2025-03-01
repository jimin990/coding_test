package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_23802 {
    public static void main(String[] args) throws IOException {
        /**
         * 기본은 5개 셀이 1일때
         * 5 5 에 가로로 첫줄 세로로 첫줄 출력
         * 그렇다면 3이라면
         * 가로로 3줄까지 세로로 3줄까지 출력하는데 5 X N으로 출력
         *
         * 우선 배열을 만듬 5 X N 크기의 이차원 배열을 먼저 만듬
         * 그리고 N보다 작으면 꽉채우고 아니면 N까지만 채우기
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N*5][N*5];

        for (int i = 0; i < N*5; i++) {
            for (int j = 0; j < N*5; j++) {

                if(i < N){
                    arr[i][j] = 1;
                }else arr[i][j] = 0;

            }
        }

        for (int i = 0; i < N*5; i++) {
            for (int j = 0; j < N*5; j++) {

                if(i < N){
                    arr[j][i] = 1;
                }

            }
        }

        for (int i = 0; i < N*5; i++) {
            for (int j = 0; j < N*5; j++) {
                if(arr[i][j] == 1){
                    System.out.print("@");
                }
            }

            System.out.println();
        }

    }
}
