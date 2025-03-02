package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Num_10952 {
    public static void main(String[] args) throws IOException {
        /**
         * 두 정수를 입력 받고 그 합을 출력한다.
         *
         * 종료 조건이 없기 때문에 입력이 없을 시 종료
         * = scanner을 사용하면 되나?
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        while(true){
            st = new StringTokenizer(br.readLine());
            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            if(A == 0){
                return;
            }
            System.out.println(A + B);
        }
    }
}
