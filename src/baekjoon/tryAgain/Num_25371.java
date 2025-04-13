package baekjoon.tryAgain;

import java.io.*;
import java.util.StringTokenizer;

public class Num_25371 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());

        String str = Integer.toString(n, k);


        String[] split = str.split("0");

        long sum =0;

        for (String s : split) {
            if(s.isEmpty()){

            }else{
                sum += Long.parseLong(s);
            }

        }

        String result= Long.toString(sum, k);

        bw.write(result);
        bw.flush();
        bw.close();
    }
}
