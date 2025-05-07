package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_5717 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine());

            int M = Integer.parseInt(st.nextToken());
            int F = Integer.parseInt(st.nextToken());

            if(M == 0){

                bw.flush();
                bw.close();
                return;
            }

            bw.write(String.valueOf(M+F));
            bw.newLine();
        }
    }
}
