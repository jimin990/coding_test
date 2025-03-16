package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Num_24039 {
    public static void main(String[] args) throws IOException {
        /**
         * 소수를 배열을 먼저 만든다.
         * 소수는 자신만이 나누어 떨어지는 수이다.
         * 
         * 나누어 떨어지는지 확인
         *그 중 작은 수가 소수인지 확인
         *그 다음 수가 그 다음 크기의 소수인지 확인 - 작은수와 큰수 사이에 소수가 잇는지 확인
         * 
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        List<Integer> list = new ArrayList<>();

        list.add(2);
        list.add(3);

        for (int i = 4; i < N; i++) {

            int sosu=0;
            for (int j = 2; j < i; j++) {
                if(i%j ==0){
                    sosu++;
                }
            }

            if(sosu == 0){
                list.add(i);
            }
        }


        for (int i = 0; i < list.size()-1; i++) {
            int so = list.get(i) * list.get(i + 1);
            if(so > N){
                bw.write(String.valueOf(so));
                break;
            }
        }

        bw.flush();
        bw.close();

    }
}
