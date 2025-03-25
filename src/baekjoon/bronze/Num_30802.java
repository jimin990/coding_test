package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_30802 {
    public static void main(String[] args) throws IOException {
        /**
         * T를 사이즈 갯수 마다 0이하가 나올때 까지 빼주고 빼줄 때 마다 +1
         * 펜은 총 N / T + N%T
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int totalBudle = 0;

        int[] size = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < 6; i++) {
            size[i] = Integer.parseInt(st.nextToken());
        }

        st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());
        int P = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 6; i++) {
            while(size[i] >0){
                size[i] -= T;
                totalBudle++;
            }
        }

        bw.write(String.valueOf(totalBudle));
        bw.newLine();
        bw.write(N/P + " " + N%P);
        bw.flush();
        bw.close();
    }
}
