package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_22938 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x1 = Integer.parseInt(st.nextToken());
        int y1 = Integer.parseInt(st.nextToken());
        int R1 = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());

        int x2 = Integer.parseInt(st.nextToken());
        int y2 = Integer.parseInt(st.nextToken());
        int R2 = Integer.parseInt(st.nextToken());

        int length = (int) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

        int R = R1+R2;

        if(R > length){
            bw.write("YES");
        }else bw.write("NO");

        bw.flush();
        bw.close();
    }
}
