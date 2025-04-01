package baekjoon.unsolved;

import java.io.*;
import java.util.*;

public class Num_22951 {
    public static void main(String[] args) throws IOException {

        /**
         * 시간이 날 때 원형리스트로 구현
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        List<Integer> list = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();


        for (int i = 1; i <= N; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j = 0; j < K; j++) {
                Integer card = Integer.valueOf(st.nextToken());
                list.add(card);
                map.put(card,i);
            }
        }


        int location = 0;
        while(list.size() > 1){

            int card = list.get(location);
            list.remove(location);

            card = (card % list.size()) -1;

            location = card + location % list.size();

        }

        bw.write(String.valueOf(location));
        bw.flush();
        bw.close();

    }
}
