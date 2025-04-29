package baekjoon.unsolved;

import java.io.*;

public class Num_9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());


        if(K == 1){
            bw.write("0 1");
        }else{

            int[] A = new int[K+1];
            int[] B = new int[K+1];
            A[1] = 0;
            A[2] = 1;

            B[1] = 1;
            B[2] = 1;

            for (int i = 3; i <= K; i++) {
                A[i] = A[i-1] + A[i-2];
                B[i] = B[i-1] + B[i-2];
            }

            bw.write(A[K] + " " + B[K]);
        }

        bw.flush();
        bw.close();
    }
}
