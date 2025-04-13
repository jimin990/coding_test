package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_25425 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // N 팀
        int M = Integer.parseInt(st.nextToken()); // M명의 인원
        int a = Integer.parseInt(st.nextToken()); //  남은 인원 a
        int K = Integer.parseInt(st.nextToken()); // 준혁이 팀 남은 인원 K명
        /**
         * 48명 남음 = 30보다 작다는건 30팀 남았을 수 도 잇다.
         * 51 /5 하면 11
         * 51보다 30이 작으면 30 51이 더 작으면 그만큼
         */

        // 30 5 5 5
        // 30 5 5 4
        // 30 5 51 3
        if(a-K == 0){
            bw.write("1");
            bw.write(" ");
            bw.write("1");
        }else{

            int possibleTeamCount = a - K;  // 팀을 만들 수 있는 수
            int max = Math.min(N, possibleTeamCount);  // 전체 팀 수보다 많을 수는 없음

            int min = (int)Math.ceil((a - K) / (double)M) + 1;



            bw.write(String.valueOf(max));
            bw.write(" ");
            bw.write(String.valueOf(min));
        }
        bw.flush();
        bw.close();
    }
}
