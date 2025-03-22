package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_27110 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result = 0;

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 3; i++) {
            int P = Integer.parseInt(st.nextToken());

            if(P >= N){
                result += N;
            } else result += P;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
