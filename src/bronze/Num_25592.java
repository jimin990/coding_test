package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력 N 바둑돌 계수
 * 푸앙 먼저 시작 1
 * 홀수 수 일때 N 이 부족하면 거기에 추가
 * 예)
 * N = 7
 * 1 2 3 4
 * while 문 i가 홀수 일때 n - 숫자 했을때 부족하면 추가
 *
 * 예)
 * 4
 * 1 2 3
 * 3일때 1이기때문에
 * 3 - 1 = 결과
 */
public class Num_25592 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        int i = 1;
        /**
         * N = 4
         * i = 1
         *  3 = 4 - 1
         *
         *  N =3
         *  i=2
         *  1 = 3-2
         *
         *  N =1
         *  i=3
         *  -2 =1 -3
         */
        while(true){


            System.out.println("현재 i = " + i + " 현재 N: " + N + " N-i:" + (N-i));
            if(N - i < 0){
                if(i%2 == 1){
                    System.out.println(i - N);
                    return;
                }else {
                    System.out.println(0);
                    return;
                }
            }

            N -=i;
            i++;


        }
    }
}
