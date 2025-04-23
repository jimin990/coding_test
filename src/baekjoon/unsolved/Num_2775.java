package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_2775 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken());

        int[][] arr = new int[14][14];

        for (int i = 0; i < 14; i++) {
            arr[0][i] = i + 1;
        }

        for (int i = 1; i < 14; i++) {
            for (int j = 0; j < 14; j++) {

            }
        }

        for (int i = 0; i < T; i++) {
            int k = Integer.parseInt(br.readLine())-1;
            int n = Integer.parseInt(br.readLine());

            for (int j = 1; j < k; j++) {
                for (int l = 0; l < n; l++) {

                    arr[j][l] += arr[j-1][l];
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
