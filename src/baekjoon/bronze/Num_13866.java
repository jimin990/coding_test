package baekjoon.bronze;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_13866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] arr = new int[4];

        for (int i = 0; i < 4; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr);

        int result = (arr[3] + arr[0]) - (arr[2] + arr[1]);


        bw.write(String.valueOf(Math.abs(result)));
        bw.flush();
        bw.close();

    }
}
