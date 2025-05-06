package baekjoon.bronze;

import java.io.*;

public class Num_7572 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());

        int diff = N - 1984;

        int gan = (diff % 10 + 10) % 10;   // 십간 숫자
        int ji = (diff % 12 + 12) % 12;   // 십이지 문자 인덱스

        char[] arr2 = new char[12];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = (char) (65 + i); // A~L
        }

        bw.write(String.valueOf(arr2[ji]));
        bw.write(String.valueOf(gan));
        bw.flush();
        bw.close();
    }
}
