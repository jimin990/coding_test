package baekjoon.bronze;

import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Num_3052 {
    public static void main(String[] args) throws IOException {
        /**
         * 42로 나누었을때 다른게 몇개 있는지
         * 입력은 10개
         *
         * //1. 이중 루프로 계산하는 방법
         * 2. 맵을 사용해서
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Set<Integer> set = new HashSet<>();

        for (int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine()) % 42;
            set.add(n);
        }

        bw.write(String.valueOf(set.size()));
        bw.flush();
        bw.close();
    }
}
