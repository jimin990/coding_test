package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_2525 {
    public static void main(String[] args) throws IOException {

        /**
         * A시 B분 C걸리는 시간
         *
         * C를 60으로 나누고 나머지는 B에 더하고
         * 나눈 값은 A에 더함
         * 만약 나머지를 더했을때 B가 60을 넘어가면 다시 60으로 나누고 똑같이 함
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(br.readLine());

        A+=C/60;
        B+=C%60;
        if(B>=60){
            A+=B/60;
            B=B%60;
        }

        if(A >=24){
            A %= 24;
        }
        bw.write(String.valueOf(A + " " + B));
        bw.flush();
        bw.close();
    }
}
