package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

/**
 * 5 4
 * 6
 * 1 2 4
 * 4 3 4
 * 5 2 4
 * 1 5 3
 * 2 3 3
 * 4 1 1
 */
public class Num_32344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int R = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int N = Integer.parseInt(br.readLine());

        int[][] max = new int[N+1][2];
        int[][] min = new int[N+1][2];


        for (int i = 0; i < N+1; i++) {
            for (int j = 0; j < 2; j++) {
                min[i][0] = Integer.MAX_VALUE;
                max[i][1] = Integer.MIN_VALUE;
            }
        }

        for(int i =1; i < N; i++){

            st = new StringTokenizer(br.readLine());

            int a,v,h;

            a = Integer.parseInt(st.nextToken());
            v = Integer.parseInt(st.nextToken());
            h = Integer.parseInt(st.nextToken());

            max[a][0] = Math.max(max[a][0], v);
            max[a][1] = Math.max(max[a][1], h);

            min[a][0] = Math.min(min[a][0], v);
            min[a][1] = Math.min(min[a][1], h);

        }

        int num = 0;
        int maxSize = 0;

        for (int i = 1; i < N + 1; i++) {

            if(!(max[i][0] == Integer.MIN_VALUE || min[i][0] == Integer.MAX_VALUE)){

                int tmp = (max[i][0] - min[i][0] + 1) * (max[i][1] - min[i][1] + 1);
                if(maxSize > tmp){
                    num=i;
                    maxSize = tmp;
                }
            }
        }

        bw.write(num + " " + maxSize);
        bw.flush();
        bw.close();
    }
}
