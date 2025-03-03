package baekjoon.bronze;

import java.io.*;

public class Num_2675 {
    public static void main(String[] args) throws IOException {


        /**
         * 입력을 받고 공백으로 분리
         * 각 문자마다 받은 테스트 케이스만큼 repeat
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        for (int i = 0; i < T; i++) {
            String[] str = br.readLine().split(" ");

            int R = Integer.parseInt(str[0]);
            for (int j = 0; j <str[1].length(); j++) {
                bw.write(String.valueOf(str[1].charAt(j)).repeat(R));
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
