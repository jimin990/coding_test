package baekjoon.bronze;

import java.io.*;

public class Num_31497 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        String[] arr = new String[N];

        for (int i = 0; i < N; i++) {
            arr[i] = br.readLine();
        }

        for (int i = 0; i < N; i++) {
            System.out.println("? " + arr[i]);
            System.out.flush();

            String A = br.readLine();

            System.out.println("? " + arr[i]);
            System.out.flush();

            String B = br.readLine();

            if(!A.equals(B)){
                bw.write("!" + arr[i]);
                bw.flush();
                bw.close();
                return;
            }
        }

    }
}
