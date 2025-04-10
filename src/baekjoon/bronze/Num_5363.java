package baekjoon.bronze;

import java.io.*;

public class Num_5363 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String[] split = br.readLine().split(" ");

            for (int j = 2; j < split.length; j++) {
                bw.write(split[j]);
                bw.write(" ");
            }

            bw.write(split[0]);
            bw.write(" ");
            bw.write(split[1]);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
