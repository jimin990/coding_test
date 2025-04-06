package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_17949 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringBuilder str = new StringBuilder(br.readLine());


        int N = Integer.parseInt(br.readLine());

        

        StringTokenizer st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            String type = st.nextToken();

            if (type.equals("char")) {
                int sub = Integer.parseInt(str.substring(0, 2), 16);
                str.delete(0, 2);
                bw.write(String.valueOf(sub));
                bw.write(" ");
            } else if (type.equals("int")) {
                int sub = Integer.parseInt(str.substring(0, 8), 16);
                str.delete(0, 8);
                bw.write(String.valueOf(sub));
                bw.write(" ");
            } else if (type.equals("long_long")) {
                long sub = Long.parseUnsignedLong(str.substring(0, 16), 16);
                str.delete(0, 16);
                bw.write(String.valueOf(sub));
                bw.write(" ");
            }
        }


        bw.flush();
        bw.close();

    }
}
