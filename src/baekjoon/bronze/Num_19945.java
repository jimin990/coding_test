package baekjoon.bronze;

import java.io.*;

public class Num_19945 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        if(N == 0){
            bw.write("1");
        }else{
            String binaryString = Integer.toBinaryString(N);
            int n = binaryString.length();

            bw.write(String.valueOf(n));
        }

        bw.flush();
        bw.close();
    }
}
