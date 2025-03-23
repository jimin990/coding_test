package baekjoon.bronze;

import java.io.*;

public class Num_2292 {
    public static void main(String[] args) throws IOException {
        /**
         * 1
         * 6
         * 18
         * 24
         * 30
         *
         * 1
         * 7
         * 25
         * 49
         * 79
         *
         *
         * 5
         * 8
         * 6
         * 6
         *
         *
         * 17
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        long N = Long.parseLong(br.readLine());
        long result = 0;

        long i = 1;

        while (true) {

            i = i + (6 * result);

            if (N <= i) {
                bw.write(String.valueOf(result + 1));
                bw.flush();
                bw.close();
                return;
            } else {
                result++;
            }

        }


    }
}
