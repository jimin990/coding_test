package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_17945 {
    public static void main(String[] args) throws IOException {
        /**
         * x^2  + 2Ax + B = 0
         *
         * x^2  + 4x + 3 = 0
         * x(x+4) = -3
         *
         *
         *x(x+2A) = -B
         * 2 3
         * -3 -1
         */


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());;

        A*=2;

        int result1 = (int) (-A + Math.sqrt(Math.pow(A,2) - (4 * B))) / 2;
        int result2 = (int)(-A - Math.sqrt(Math.pow(A,2) - (4 * B))) / 2;


        if(result2 == result1){
           bw.write(String.valueOf(result1));
        }else{

            int max = Math.max(result1,result2);
            int min = Math.min(result1,result2);

            bw.write(String.valueOf(min));
            bw.write(" ");
            bw.write(String.valueOf(max));
        }

        bw.flush();
        bw.close();

    }
}
