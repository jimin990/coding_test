package baekjoon.tryAgain;

import java.io.*;

public class Num_32184 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");

        int A = Integer.parseInt(str[0]);
        int B = Integer.parseInt(str[1]);

       int C = 1;
        /**
         * 처음 한장은 무조건 찍은
         * 그러면 두가지 경우
         * 짝수 인 경우 홀수 인 경우
         * 1 2
         * 3 4
         * 5 6
         *
         * 짝수 인 경우는 +1 더하고
         * 홀수 인 경우 + 2
         *
         * 만약 B보다 크거나 같으면 그냥 1 출력
         * 5-3 = 2 + 1 = 3
         * B-A+1 / 2 + B-A+1%2
         */
        if (A % 2 == 0) {
            A+=1;
        }else A+=2;

        if(A >=B){
            bw.write("1");
        }else{
            C += (B - A + 1) / 2 + (B - A + 1) % 2;
            bw.write(String.valueOf(C));
        }

        bw.flush();
        bw.close();
    }
}
