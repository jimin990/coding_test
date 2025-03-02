package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2439 {
    public static void main(String[] args) throws IOException {
        /**
         * N을 입력받고 별을 출력
         *
         * N - i
         * 5- 1 = 4
         * 5- 2 = 3 이상이면 별 출력
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine())+1;

        for (int i = 1; i < N; i++) {
            for (int j = 1; j < N; j++) {
                if(N-i <=j){
                    System.out.print("*");
                }else System.out.print(" ");
            }
            System.out.println();
        }


    }
}
