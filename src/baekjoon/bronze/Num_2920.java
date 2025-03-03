package baekjoon.bronze;

import java.io.*;

public class Num_2920 {
    public static void main(String[] args) throws IOException {
        /**
         * 문자열을 입력 받고
         * 123순서면 ascending
         * 반대면 descending
         * 둘다 아니면 mixed
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine().replace(" ","");

        if (str.equals("12345678")) {
            bw.write("ascending");
        }else if(str.equals("87654321")){
            bw.write("descending");
        } else bw.write("mixed");

        bw.flush();
        bw.close();
    }
}
