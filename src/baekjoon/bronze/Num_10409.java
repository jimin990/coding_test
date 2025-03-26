package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_10409 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int T = Integer.parseInt(st.nextToken());

        int result = 0;

        st = new StringTokenizer(br.readLine());
        for (int i = 0; i < n; i++) {
            T -= Integer.parseInt(st.nextToken());
            if (T >= 0) {
                result++;
            } else break;
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
