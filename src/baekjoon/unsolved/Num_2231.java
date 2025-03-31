package baekjoon.unsolved;

import java.io.*;

public class Num_2231 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        int n = 0;
        while(true){

            n++;

            int result =n;
            String nStr = String.valueOf(n);

            String[] split = nStr.split("");

            for (int i = 0; i < split.length; i++) {
                result+=Integer.parseInt(split[i]);
            }

            if(N.equals(String.valueOf(result))){
                bw.write(String.valueOf(n));
                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
