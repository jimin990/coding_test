package baekjoon.unsolved;

import java.io.*;
import java.util.Arrays;

public class Num_10989 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //Integer[] arr = new Integer[N];

        int[] arr1 = new int[N];
        for (int i = 0; i < N; i++) {
            //arr[i] = Integer.valueOf(br.readLine());
            arr1[i] = Integer.valueOf(br.readLine());
        }


        Arrays.sort(arr1);
        //Arrays.sort(arr);

        for (int i : arr1) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
