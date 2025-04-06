package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1978 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result =0;
        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());
            if(num==1){

            }else {

                int sosu = 0;

                for (int j = 2; j <= num; j++) {
                    if (num % j == 0) {
                        sosu++;
                    }
                }

                if (sosu==1) {
                    result++;
                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
