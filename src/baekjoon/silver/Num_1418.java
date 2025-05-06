package baekjoon.silver;

import java.io.*;
import java.util.Arrays;

public class Num_1418 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int K = Integer.parseInt(br.readLine());

        boolean[] list = new boolean[N+2];

        Arrays.fill(list, true);
        list[0] = false;
        list[1] = false;

        for (int i = 0; i < list.length; i++) {
            if (list[i]) {
                int j= 2;

                while((i * j) < list.length){
                    list[i * j] = false;
                    j++;
                }

            }
        }

        int result = 1;

        for (int i = 2; i <= N; i++) {
            result++;

            for (int j = 2; j*j <= i; j++) {
                if (i % j == 0) {

                    int other = i / j;

                    if (list[j] && j > K) {
                        result--;
                        break;
                    }

                    // i/j가 소수이고 K보다 크면 탈락
                    if (list[other] && other > K) {
                        result--;
                        break;
                    }


                }
            }

            if (list[i] && i > K) {
                result--;
            }
        }

        bw.write(String.valueOf(result));
        bw.newLine();
        bw.close();
    }
}
