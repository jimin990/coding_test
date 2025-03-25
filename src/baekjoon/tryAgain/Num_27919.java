package baekjoon.tryAgain;

import java.io.*;

public class Num_27919 {
    public static void main(String[] args) throws IOException {
        /**
         * 각자 변수를 만들어 각 문자가 나올 때 1씩 증가 시켜준다.
         * 이때 U일 경우는 C도 더 해주고,
         * C일 경우 U도 더해준다.
         *
         * 마찬가지로 D, P도 이런식으로 처리해주고,
         * 마지막으로 숫자가 제일 큰 것들만 출력해준다.
         * C는 사실 상 출력 될 수 없다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        int U = 0;
        int D = 0;
        int P = 0;
        int C = 0;

        for (char c : str.toCharArray()) {
            if(c == 'U'){
                U++;
                C++;
            }else if(c == 'D'){
                D++;
                P++;
            }else if(c == 'P'){
                D++;
                P++;
            }else if(c == 'C'){
                U++;
                C++;
            }
        }

        int n = D/2 + D%2;

        if (n < U) {
            bw.write("U");
        }

        int max = Math.max(U, D);

        if(max<= D){
            bw.write("D");
            bw.write("P");
        }

        bw.flush();
        bw.close();

    }
}
