package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_2704 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine(), ":");
            int H = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int S = Integer.parseInt(st.nextToken());


            String fH = String.format("%06d", Integer.parseInt(Integer.toBinaryString(H)));
            String fM = String.format("%06d", Integer.parseInt(Integer.toBinaryString(M)));
            String fS = String.format("%06d", Integer.parseInt(Integer.toBinaryString(S)));

            for (int j = 0; j < 6; j++) {
                bw.write(fH.charAt(j));
                bw.write(fM.charAt(j));
                bw.write(fS.charAt(j));
            }
            bw.write(" ");
            bw.write(fH + fM + fS);
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
