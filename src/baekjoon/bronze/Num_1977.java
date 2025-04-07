package baekjoon.bronze;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Num_1977 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        List<Integer> list =new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            list.add((int) Math.pow(i,2));
        }

        int result = 0;
        int min = Integer.MAX_VALUE;

        for (int i = M; i <= N; i++) {
            if(list.contains(i)){
                result += i;
                min = Math.min(min, i);
            }
        }

        if(result ==0){
            bw.write("-1");
        }else{
            bw.write(String.valueOf(result));
            bw.newLine();
            bw.write(String.valueOf(min));
        }
        bw.flush();
        bw.close();
    }
}
