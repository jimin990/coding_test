package baekjoon.silver;

import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

/*
public class Num_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            if(set.contains(Integer.parseInt(st.nextToken()))){
                bw.write("1");
            }else{
                bw.write("0");
            }
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
*/
public class Num_1920 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder sB = new StringBuilder();

        int N = Integer.parseInt(br.readLine());

        HashSet<Integer> set = new HashSet<>();

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            set.add(Integer.valueOf(st.nextToken()));
        }

        int M = Integer.parseInt(br.readLine());

        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            if(set.contains(Integer.parseInt(st.nextToken()))){
                sB.append("1\n");
            }else{
                sB.append("0\n");
            }
        }

        System.out.print(sB);
    }
}
