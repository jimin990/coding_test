package baekjoon.bronze;

import java.io.*;

public class Num_1152 {
    public static void main(String[] args) throws IOException {
        /**
         * split으로 분해
         *
         * 공백일 경우 제거
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = 0;
        String[] str = br.readLine().split(" ");

        for (int j = 0; j < str.length; j++) {
            if(!str[j].isEmpty()){
                i++;
            }
        }

        bw.write(String.valueOf(i));
        bw.flush();
        bw.close();

    }
}
