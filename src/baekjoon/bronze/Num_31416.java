package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_31416 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tA = Integer.parseInt(st.nextToken());
            int tB = Integer.parseInt(st.nextToken());
            int vA = Integer.parseInt(st.nextToken());
            int vB = Integer.parseInt(st.nextToken());

            /**
             * 상혁이가 할때 도훈이가 몇개 도와주는지를 코드로 작성해야한다.
             */

            int min =Integer.MAX_VALUE;
            for (int j = 0; j < vA; j++) {
                int max = Math.max(tA * (vA - j), (tB * vB) + (tA * j));
                min = Math.min(min, max);
            }

            bw.write(String.valueOf(min));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
