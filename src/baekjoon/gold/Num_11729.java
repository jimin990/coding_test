package baekjoon.gold;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11729 {
    static int num = 0;
    static BufferedWriter bw;

    static StringBuilder sb;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        sb = new StringBuilder();


        func(1, 3, n);

        System.out.println(num); // (1) 먼저 이동 횟수를 출력
        System.out.println(sb);

    }

    static void func(int a, int b, int n) throws IOException {
        if (n == 1) {
            num++;
            //bw.write(a + " " + b);
            sb.append(a + " " + b+ "\n");
            //bw.newLine();
            return;
        }

        func(a, 6 - a - b, n - 1); // (1) n-1개의 원반을 보조 기둥으로 이동
        func(a, b,1);
        func(6 - a - b, b, n - 1); // (4) n-1개의 원반을 보조 기둥에서 목표 기둥으로 이동
    }
}