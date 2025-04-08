package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_2798 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int[] arr = new int[M];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max = Integer.MIN_VALUE;

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                if(i==j){
                    continue;
                }
                for (int k = 0; k < N; k++) {
                    if(j==k||i==k){
                        continue;
                    }
                    int num = arr[i]+arr[j]+arr[k];
                    if(num<=M){
                        max = Math.max(max, num);
                    }

                }
            }
        }


        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}
