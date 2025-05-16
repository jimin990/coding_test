package baekjoon.bronze;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num_10807 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashMap<Integer, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            int num = Integer.parseInt(st.nextToken());

            if(map.containsKey(num)){
                map.replace(num,map.get(num)+1);
            }else{
                map.put(num,1);
            }
        }

        int v = Integer.parseInt(br.readLine());

        if(map.containsKey(v)){
            bw.write(String.valueOf(map.get(v)));
        }else{
            bw.write("0");
        }

        bw.flush();
        bw.close();
    }
}
