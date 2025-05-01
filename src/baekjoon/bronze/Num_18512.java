package baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num_18512 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int X = Integer.parseInt(st.nextToken());
        int Y = Integer.parseInt(st.nextToken());
        int P1 = Integer.parseInt(st.nextToken());
        int P2 = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 0; i < 100000; i++) {
            int sum = P1 + (X * i);
            list.add(sum);
        }

        for (int i = 0; i < 100000; i++) {
            int sum = P2 + (Y * i);
            if(list.contains(sum)){
                bw.write(String.valueOf(sum));
                bw.flush();
                bw.close();

                return;
            }
        }

        bw.write("-1");
        bw.flush();
        bw.close();

    }
}
