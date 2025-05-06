package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Num_19947 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());

        double[] arr = new double[Y+1];

        arr[0] = H;

        for (int i = 1; i <= Y; i++) {

            arr[i] = Math.floor(arr[i-1] * 1.05);

            if (i >= 5) {
                arr[i] = Math.max(arr[i], Math.floor(arr[i-5] * 1.35));
            }

            if (i >= 3) {
                arr[i] = Math.max(arr[i], Math.floor(arr[i-3] * 1.20));
            }
        }



        bw.write(String.valueOf((int)arr[Y]));
        bw.newLine();
        bw.close();
    }
}

