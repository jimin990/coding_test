package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_31416 {
    public static void main(String[] args) throws IOException {

        /**
         * 4
         * 3 3 7 5
         * 2 3 5 7
         * 3 2 7 5
         *
         * 10
         *
         * 4
         *
         * 12
         *
         * 3
         *
         * 2
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int Q = Integer.parseInt(br.readLine());

        for (int i = 0; i < Q; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            int tA = Integer.parseInt(st.nextToken());
            int tB = Integer.parseInt(st.nextToken());
            int vA = Integer.parseInt(st.nextToken());
            int vB = Integer.parseInt(st.nextToken());

            if (tA * vA <= tB * vB) {
                bw.write(String.valueOf(tB * vB));
                bw.newLine();
            } else {
                int b = tB * vB;
                int a=0;

                if(b>=0){

                    b -=tA;
                    a++;
                }

                vA-=a;



                bw.write(String.valueOf(b));
                bw.newLine();
            }
        }

        bw.flush();
        bw.close();
    }
}
