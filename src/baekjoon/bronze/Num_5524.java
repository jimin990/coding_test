package baekjoon.bronze;

import java.io.*;

public class Num_5524 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            String lowerCase = str.toLowerCase();
            bw.write(lowerCase);
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
