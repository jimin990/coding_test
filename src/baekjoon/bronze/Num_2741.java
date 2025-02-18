package baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N을 입력을 받고
 * 반복문 돌리셔 1부터 시작 그러므로 N + 1
 */
public class Num_2741 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine()) + 1;

        for (int i = 1; i < N; i++) {
            System.out.println(i);
        }
    }
}
