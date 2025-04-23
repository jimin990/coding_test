package baekjoon.bronze;

import java.io.*;

public class Num_10039 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = 0;

        for (int i = 0; i < 5; i++) {
            int n = Integer.parseInt(br.readLine());
            if(n<40) result+=40;
            else result+=n;
        }

        bw.write(String.valueOf(result/5));
        bw.flush();
        bw.close();
    }
}
