package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_16546 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[N+1];

        arr[0] = 1;

        for (int i = 0; i < N-1; i++) {
            int n = Integer.parseInt(st.nextToken());

            arr[n]=1;
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == 0){
                bw.write(String.valueOf(i));
                bw.flush();
                bw.close();
                return;
            }
        }
    }
}
