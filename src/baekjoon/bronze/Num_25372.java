package baekjoon.bronze;

import java.io.*;

public class Num_25372 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());

        for(int i=0;i<N;i++){
            String str = br.readLine();
            int wordN = str.length();

            if(6<=wordN && wordN <=9){
                bw.write("yes");
            }else bw.write("no");

            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
