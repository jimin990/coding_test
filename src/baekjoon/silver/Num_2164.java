package baekjoon.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;

public class Num_2164 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        LinkedList<Integer> list = new LinkedList<>();

        int N = Integer.parseInt(br.readLine());

        for (int i = 1; i <= N; i++) {
            list.add(i);
        }

        while(list.size() != 1){
            list.remove(0);

            if(list.size() == 1){
                break;
            }

            Integer i = list.get(0);
            list.remove(0);
            list.add(i);
        }

        System.out.println(list.get(0));

    }
}
