package baekjoon.silver;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Num_32172 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int[] arr = new int[N+1];

        Set<Integer> set = new HashSet<>();

        arr[0] = 0;
        set.add(0);

        for (int i = 1; i <= N; i++) {

            int Ai = arr[i-1] -i;

            if(Ai < 0 || set.contains(Ai)){
                Ai = arr[i-1] + i;
            }

            set.add(Ai);
            arr[i] = Ai;
        }

        bw.write(String.valueOf(arr[N]));
        bw.flush();
        bw.close();
    }
}
