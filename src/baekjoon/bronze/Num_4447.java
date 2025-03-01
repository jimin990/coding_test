package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_4447 {
    public static void main(String[] args) throws IOException {
        /**
         * g와 b의 크기를 세는 문제
         * 1. replace로 하는 방법
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();

            int n = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.toUpperCase().charAt(j) == 'G'){
                    n++;
                }else if(str.toUpperCase().charAt(j) == 'B'){
                    n--;
                }
            }

            if (n == 0) {
                System.out.println(str + " is NEUTRAL");
            }else if(n < 0){
                System.out.println(str + " is A BADDY");
            }else  System.out.println(str + " is GOOD");
        }
    }
}
