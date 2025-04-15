package baekjoon.silver;

import java.io.*;
import java.util.*;

public class Num_25192 {
    public static void main(String[] args) throws IOException{

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Set<String> set = new HashSet<>();
        int result = 0;

        for (int i = 0; i < N; i++) {
            String str = br.readLine();

            if(str.equals("ENTER")){
                result += set.size();
                set.clear();
                continue;
            }

            set.add(str);

        }

        result += set.size();

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
