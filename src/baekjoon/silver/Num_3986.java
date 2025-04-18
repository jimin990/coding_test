package baekjoon.silver;

import java.io.*;

public class Num_3986 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result =0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            while (str.contains("AA") || str.contains("BB")) {

                if (str.contains("AA")) {

                    str = str.replaceAll("AA", "");
                }

                if (str.contains("BB")) {

                    str = str.replaceAll("BB", "");
                }
            }

            if (str.isEmpty()) {
                result++;
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}