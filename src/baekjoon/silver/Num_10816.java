package baekjoon.silver;

import java.io.*;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Num_10816 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashMap<String, Integer> map = new HashMap<>();

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {

            String k = st.nextToken();
            if(map.containsKey(k)){
                map.replace(k, map.get(k) + 1);
            }else{
                map.put(k, 1);
            }
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            String k = st.nextToken();

            if(map.get(k) != null){

                bw.write(map.get(k) + " ");
            }else{
                bw.write("0 ");
            }
        }


        bw.flush();
        bw.close();
    }
}
