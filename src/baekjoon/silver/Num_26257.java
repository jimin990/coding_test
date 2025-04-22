package baekjoon.silver;

import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Num_26257 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int Q = Integer.parseInt(st.nextToken());

        int[] arr = new int[M];

        for (int i = 0; i < M; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        for (int i = 0; i < Q; i++) {
            st = new StringTokenizer(br.readLine());

            String cal = st.nextToken();

            if(cal.equals("reset")){
                int x = Integer.parseInt(st.nextToken())-1;
                arr[x] =0;
            }else{
                int x = Integer.parseInt(st.nextToken())-1;
                int y = Integer.parseInt(st.nextToken())-1;

                if(cal.equals("assign")){
                    arr[x] = arr[y];
                }else{
                    int tmp = arr[x];
                    arr[x] = arr[y];
                    arr[y] = tmp;
                }
            }
        }

        Set<Integer> set = new TreeSet<>();
        for (int i = 0; i < M; i++) {
            if(arr[i] !=0){
                set.add(arr[i]);
            }
        }

        bw.write(String.valueOf(set.size()));
        bw.newLine();
        for (Integer i : set) {
            bw.write(String.valueOf(i));
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}
