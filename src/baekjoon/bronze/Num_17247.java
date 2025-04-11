package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_17247 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());


        int x1 = 0;
        int x2 = 0;
        int y1 = 0;
        int y2 = 0;
        int num =0;


        for (int i = 0; i < N; i++) {

            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < M; j++) {
                if(1 == Integer.parseInt(st.nextToken())){
                    if(num ==0){

                        x1 = i;
                        y1 = j;
                        num++;
                    }else{
                        x2 = i;
                        y2 = j;
                    }
                }
            }
        }

        int D = Math.abs(x2-x1) + Math.abs(y2 - y1);

        bw.write(String.valueOf(D));
        bw.flush();
        bw.close();

    }
}
