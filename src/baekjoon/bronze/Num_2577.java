package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2577 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());
        int C = Integer.parseInt(br.readLine());

        String ABC  = String.valueOf(A * B * C);

        int[] arr = new int[10];
        for (int i = 0; i < ABC.length(); i++) {

            arr[ABC.charAt(i)-'0']++;
        }

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }

    }
}
