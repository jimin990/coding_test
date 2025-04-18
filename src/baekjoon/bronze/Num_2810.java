package baekjoon.bronze;

import java.io.*;

public class Num_2810 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());

        String str = br.readLine();

        String replaceAll = str.replaceAll("LL", "s");
        int min = Math.min(N, replaceAll.length() + 1);

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();

    }
}
