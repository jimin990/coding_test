package baekjoon.bronze;

import java.io.*;

public class Num_8958 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 이전 정답 상태를 저장하는 변수
         * X 를 만나면 1로 초기화
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            String str = br.readLine();
            int beforO =0;
            int result = 0;
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j)=='O'){
                    beforO++;
                    result+=beforO;
                }else beforO=0;
            }

            bw.write(String.valueOf(result));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
