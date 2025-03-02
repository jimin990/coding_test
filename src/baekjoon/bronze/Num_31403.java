package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_31403 {
    public static void main(String[] args) throws IOException {
        /**
         * 정수 3가지를 입력받는다.
         *
         * 첫번째는 그냥 계산
         * 두번째는 String으로 바꿔서 계한
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String A = br.readLine();
        String B = br.readLine();
        String C = br.readLine();


        System.out.println(Integer.parseInt(A)+Integer.parseInt(B)-Integer.parseInt(C));
        System.out.println(Integer.parseInt(A+B) - Integer.parseInt(C));
    }
}
