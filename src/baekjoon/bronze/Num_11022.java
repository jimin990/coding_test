package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_11022 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            int num1 = Integer.parseInt(st.nextToken());
            int num2 = Integer.parseInt(st.nextToken());

            bw.write("Case #" + i + ": " + num1 + " + " + num2 + " = "+(num1 + num2));
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
