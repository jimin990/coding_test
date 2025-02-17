package bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * N번째 줄에는 N개의 별을 찍는 문제
 *
 * 입력
 * N을 받는다.
 *
 * for문으로 i가 N까지 반복하면서 증가
 * 여기서 0부터 시작하는게 아니라 1부터 시작하도록 N + 1로 숫자를 설정
 */
public class Num_2438 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine()) + 1;

        for (int i = 1; i < N; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
