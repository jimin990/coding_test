package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_27433 {
    public static void main(String[] args) throws IOException {
        /**
         * 팩토리얼을 출력하는 문제
         *
         * N < 20을 입력 받고
         *
         * 루프문을 돌리면서 1씩감소 시키면서 0전 까지 곱하고 마지막 숫자 출력
         * 항상 자료형을 조심하자.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        //20!까지 표현이 되야함으로 int형이 아닌 long을 사용해야한다, 굉장히 중요!
        long f =1;

        //0일 경우 예외 처리를 해준다.
        if (N == 0) {
            System.out.println(1);
            return;
        }

        for (int i = N; i > 1; i--) {
            f *= i;
        }
        System.out.println(f);

    }
}
