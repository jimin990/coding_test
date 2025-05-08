package baekjoon.silver;

import java.io.*;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Num_11866 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sB = new StringBuilder();
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        int num = 0;

        sB.append("<");
        while (!list.isEmpty()) {

            num += (K - 1);
            num %= list.size();

            sB.append(list.get(num));
            if (list.size() != 1) {
                sB.append(", ");
            }
            list.remove(num);

        }
        sB.append(">");
        System.out.println(sB);

    }
}
