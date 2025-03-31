package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_1491 {
    public static void main(String[] args) throws IOException {
        /**
         * 실제로 돌리기.2차원 배열을 사용해서 만들기.
         *
         *
         *
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[][] arr = new int[M][N];

        for (int i = 0; i < M; i++) {
            for (int j = 0; j < N; j++) {
                arr[i][j] = 0;
            }
        }

        int i = M;
        int j = 0;

        int status = 0;

        while(true){

            arr[i][j] = 1;

            if(status == 0){
                j++;
            }else if(status == 1){

            } else if(status == 2){

            }else{

            }

            if(j==N && arr[i][j] == 1 ){
                j--;

                i = M;
                j= N;

                status++;
                if(status==4){
                    status =0;
                }


            }

        }



    }
}
