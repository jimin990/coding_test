package baekjoon.silver;

import java.io.*;
import java.util.*;

public class Num_1181 {
    public static void main(String[] args) throws IOException {

        /**
         * 줄 수 입력 받기
         * 1. 짫은 수 부터
         * 2. 사전 순으로
         *
         *
         * 우선 사전 순으로 정렬을 하고
         * 그 다음 출력을 짫은 것 부터 하기
         *
         * set을 이용해서 중복을 제거
         * 2 4 3
         *
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            set.add(br.readLine());
        }

        Iterator<String> iterator = set.iterator();
        String[] str = new String[set.size()];

        for (int i = 0; i < set.size(); i++) {
            str[i] = iterator.next();
        }

        Arrays.sort(str,(o1,o2)->{
            if(o1.length() == o2.length()){

                return o1.compareTo(o2);
            }else{
                return o1.length() - o2.length();
            }
        });

        for (int i = 0; i < str.length; i++) {
            bw.write(str[i]);
            bw.newLine();
        }


        bw.flush();
        bw.close();
    }
}