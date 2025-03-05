package baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_4153 {
    public static void main(String[] args) throws IOException {
        /**
         * 6 8 10
         * 25 52 60
         * 5 12 13
         * 0 0 0
         *
         * A^2 + B^2 = C^2
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){

            StringTokenizer st = new StringTokenizer(br.readLine());

            int A = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());
            int C = Integer.parseInt(st.nextToken());

            int[] arr = {A, B, C};
            Arrays.sort(arr);

            if(A ==0){
                break;
            }

            if(Math.pow(arr[0],2) + Math.pow(arr[1],2) == Math.pow(arr[2],2)){
                bw.write("right");
            } else bw.write("wrong");

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
