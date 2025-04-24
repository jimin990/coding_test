package baekjoon.silver;

import java.io.*;

public class Num_3054 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        StringBuilder sB = new StringBuilder();

        int N = str.length();

        for (int i = 1; i <= N; i++) {
            if(i%3 == 0){
                sB.append("..*.");
            }else{
                sB.append("..#.");
            }
        }
        sB.append(".");
        sB.append("\n");

        for (int i = 1; i <= N; i++) {
            if(i%3 == 0){
                sB.append(".*.*");
            }else{
                sB.append(".#.#");
            }
        }
        sB.append(".");
        sB.append("\n");

        for (int i = 1; i <= N; i++) {
            if((i%3 == 0 || (i-1) % 3 ==0) && i!=1){
                sB.append("*." + str.charAt(i-1) + ".");
            }else{
                sB.append("#." + str.charAt(i-1)+ ".");
            }
        }

        if(N%3==0){

            sB.append("*");
        }else{
            sB.append("#");
        }
        sB.append("\n");


        for (int i = 1; i <= N; i++) {
            if(i%3 == 0){
                sB.append(".*.*");
            }else{
                sB.append(".#.#");
            }
        }
        sB.append(".");
        sB.append("\n");

        for (int i = 1; i <= N; i++) {
            if(i%3 == 0){
                sB.append("..*.");
            }else{
                sB.append("..#.");
            }
        }
        sB.append(".");

        bw.write(sB.toString());
        bw.flush();
        bw.close();
    }
}
