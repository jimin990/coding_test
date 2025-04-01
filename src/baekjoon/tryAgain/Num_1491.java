package baekjoon.tryAgain;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1491 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int[][] arr = new int[N][M];

        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = 0;
            }
        }

        int i = 0;
        int j = 0;
        arr[i][j] = 1;
        int a = 2;

        int lastM = 0;
        int lastN = 0;

        while(a <= M*N) {

            while (i + 1 < N && arr[i + 1][j] == 0) {
                i++;
                arr[i][j] = a;
                a++;

                lastM = i;
                lastN = j;
            }

            while (j + 1 < M && arr[i][j + 1] == 0) {
                j++;
                arr[i][j] = a;
                a++;

                lastM = i;
                lastN = j;
            }

            while (i - 1 >= 0 && arr[i - 1][j] == 0) {
                i--;
                arr[i][j] = a;
                a++;

                lastM = i;
                lastN = j;
            }

            while (j - 1 >= 0 && arr[i][j - 1] == 0) {
                j--;
                arr[i][j] = a;
                a++;

                lastM = i;
                lastN = j;
            }





        }
        bw.write(String.valueOf(lastM));
        bw.write(" ");
        bw.write(String.valueOf(lastN));
        bw.flush();
        bw.close();
    }
}
