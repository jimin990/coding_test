package baekjoon.tryAgain;

import java.io.*;
import java.util.StringTokenizer;

public class Num_25644 {
    public static void main(String[] args) throws IOException {
        /**
         * 가장 큰 수와 가장 작은 수를 찾고
         *
         * 0~N 번까지 시작해서 가장 큰 수를 저장
         * 이중 반복문으로 해결 -> 시간 복잡도 N^2 200000^2 = 40,000,000,000 -> 1억번 초과
         *
         * 오른쪽과 왼쪽을 비교
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N];

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int max =0;
        int min =arr[0];

        for (int i = 1; i < N; i++) {
            max = Math.max(max, arr[i] - min);
            min = Math.min(min, arr[i]);
        }

        bw.write(String.valueOf(max));
        bw.flush();
        bw.close();

    }
}
