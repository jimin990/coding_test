package baekjoon.bronze;

import java.io.*;

public class Num_10102 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int V = Integer.parseInt(br.readLine());
        String[] str = br.readLine().split("");

        int result = 0;

        for (int i = 0; i < V; i++) {
            String s = str[i];
            if(s.equals("A")){
                result++;
            }else result--;
        }

        if(0 < result){
            bw.write("A");
        }else if(0 > result){
            bw.write("B");
        } else bw.write("Tie");

        bw.flush();
        bw.close();
    }
}
