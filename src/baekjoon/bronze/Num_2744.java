package baekjoon.bronze;

import java.io.*;

public class Num_2744 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();


        for (int i = 0; i < s.length(); i++) {
            if(Character.isUpperCase(s.charAt(i))){
                bw.write(String.valueOf(Character.toLowerCase(s.charAt(i))));

            }else{
                bw.write(String.valueOf(Character.toUpperCase(s.charAt(i))));
            }
        }

        bw.flush();
        bw.close();
    }
}
