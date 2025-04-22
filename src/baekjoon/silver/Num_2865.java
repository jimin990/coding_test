package baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_2865 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        float[] arr = new float[N];

        for (int j = 0; j < M; j++) {
            st  = new StringTokenizer(br.readLine());
            for (int k = 0; k < N; k++) {
                int i = Integer.parseInt(st.nextToken())-1;
                float s = Float.parseFloat(st.nextToken());

                arr[i] = Math.max(arr[i],s);
            }
        }

        Arrays.sort(arr);

        float result = 0;
        for (int i = arr.length-1; i >= arr.length-K ; i--) {
            result+=arr[i];
        }

        result = (float) (Math.round(result * 10.0) / 10.0);
        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
