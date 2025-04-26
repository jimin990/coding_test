package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1018 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        char[][] BW = new char[8][8];
        char[][] WB = new char[8][8];



        int min = Integer.MAX_VALUE;

        char[] tmp = {'W', 'B'};

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {

                if((i+1)%2 != 0){
                    BW[i][j] = tmp[(j+1) % 2];
                    WB[i][j] = tmp[(j+2) % 2];
                }else{
                    BW[i][j] = tmp[(j+2) % 2];
                    WB[i][j] = tmp[(j+1) % 2];
                }

            }
        }


        char[][] arr = new char[N][M];

        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            for (int j = 0; j < M; j++) {
                arr[i][j] = str.charAt(j);
            }
        }


        for (int i = 0; i <= N-8; i++) {
            for (int j = 0; j <= M-8; j++) {

                int w = 0;
                int b = 0;
                for (int k = 0; k < 8; k++) {
                    for (int l = 0; l < 8; l++) {
                        if(arr[k+i][l+j] != WB[k][l]){
                            w++;
                        }

                        if(arr[k+i][l+j] != BW[k][l]){
                            b++;
                        }
                    }
                }

                min = Math.min(min,Math.min(w, b));

            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();
    }
}
