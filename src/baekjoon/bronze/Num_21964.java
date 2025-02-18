package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_21964 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());

        String[] schoolMusic = br.readLine().split("");

        for (int i = N-5; i < N; i++) {
            System.out.print(schoolMusic[i]);
        }
    }
}
