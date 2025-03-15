package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_16675 {
    /**
     * -1 0 1 -1 = -1
     * 비교햇을때 무조건 4가 나와야한다.
     *
     *
     */

    public static void main(String[] args) throws IOException {

        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String mL = st.nextToken();
        String mR = st.nextToken();

        String[] mArray = {mL, mR};

        String tL = st.nextToken();
        String tR = st.nextToken();

        String[] tArray = {tL, tR};

        int m = 0;
        int t = 0;


        for (int i = 0; i < 2; i++) {

            m=0;
            for (int j = 0; j < 2; j++) {

                String m1 =mArray[i];
                String t1 =tArray[j];

                if(m1.equals("R") && t1.equals("S")){
                    m++;
                }else if(m1.equals("P") && t1.equals("R")){
                    m++;
                }else if(m1.equals("S") && t1.equals("P")){
                    m++;
                }

                if(m == 2){
                    bw.write("MS");
                    bw.flush();
                    bw.close();
                    return;
                }
            }
        }

        for (int i = 0; i < 2; i++) {
            t=0;
            for (int j = 0; j < 2; j++) {

                String m1 =mArray[j];
                String t1 =tArray[i];

                if(t1.equals("R") && m1.equals("S")){
                    t++;
                }else if(t1.equals("P") && m1.equals("R")){
                    t++;
                }else if(t1.equals("S") && m1.equals("P")){
                    t++;
                }

                if(t == 2){
                    bw.write("TK");
                    bw.flush();
                    bw.close();
                    return;
                }
            }
        }

        bw.write("?");
        bw.flush();
        bw.close();

    }
}
