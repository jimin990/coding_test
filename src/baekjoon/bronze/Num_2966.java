package baekjoon.bronze;

import java.io.*;

public class Num_2966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        char[] Adrian = {'A', 'B', 'C'};
        char[] Bruno = {'B', 'A', 'B', 'C'};
        char[] Goran = {'C', 'C', 'A', 'A', 'B', 'B'};

        int[] arr = new int[3];

        String str = br.readLine();
        for (int i = 0; i < N; i++) {
            if (str.charAt(i) == Adrian[i % 3]) {
                arr[0]++;
            }

            if (str.charAt(i) == Bruno[i % 4]) {
                arr[1]++;
            }

            if (str.charAt(i) == Goran[i % 6]) {
                arr[2]++;
            }
        }

        int max = Math.max(arr[0], Math.max(arr[1], arr[2]));

        bw.write(String.valueOf(max));
        bw.newLine();

        if (max == arr[0]) {
            bw.write("Adrian");
            bw.newLine();
        }

        if (max == arr[1]) {
            bw.write("Bruno");
            bw.newLine();
        }

        if (max == arr[2]) {
            bw.write("Goran");
            bw.newLine();
        }

        bw.flush();
        bw.close();

    }
}
