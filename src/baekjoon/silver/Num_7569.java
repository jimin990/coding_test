package baekjoon.silver;

import java.io.*;
import java.util.*;

public class Num_7569 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[][] arr = new int[N][3];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());

            arr[i][0] = x;
            arr[i][1] = y;
        }

        for (int i = 0; i < N; i++) {

            for (int j = 0; j < N; j++) {
                if((arr[i][0] < arr[j][0] && arr[i][1] < arr[j][1])){
                    arr[i][2]++;
                }
            }
        }

        for (int i = 0; i < N; i++) {
            bw.write(String.valueOf(arr[i][2]+1));
            bw.write(" ");
        }

        bw.flush();
        bw.close();
    }
}
