package baekjoon.bronze;

import java.io.*;

public class Num_2231 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        for (int i = 1; i < N; i++) {
            int sum = i;
            int tmp = i;

            while (tmp > 0) {
                sum += tmp % 10;
                tmp/=10;
            }

            if(sum == N){
                result = i;
                break;
            }

        }

        bw.write(String.valueOf(result));

        bw.flush();
        bw.close();
    }
}

