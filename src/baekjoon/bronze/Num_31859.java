package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_31859 {
    public static void main(String[] args) throws IOException {
        /**
         * 1. 알파벳이 중복되지 않도록 추출하기
         *
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer stn = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(stn.nextToken());

        String st = stn.nextToken();

        StringBuilder smupc = new StringBuilder();

        // 1
        for (int i = 0; i < st.length(); i++) {
            for (char s : st.toCharArray()) {
                if(smupc.indexOf(String.valueOf(s)) == -1){
                    smupc.append(s);
                }
            }
        }

        // 2
        int i = st.length() - smupc.length() + 4;
        smupc.append(i);

        // 3
        smupc.insert(0, String.valueOf(N + 1906));

        // 4
        smupc.reverse();

        //3
        smupc.insert(0, "smupc_");

        bw.write(String.valueOf(smupc));
        bw.flush();
        bw.close();

    }
}
