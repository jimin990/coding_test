package baekjoon.tryAgain;

import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Num_4328 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st;

        while(true){
            String str = br.readLine();

            if(str.equals("0")){
                break;
            }
            st = new StringTokenizer(str);

            int b = Integer.parseInt(st.nextToken());
            BigInteger p = new BigInteger(st.nextToken(),b);
            BigInteger m = new BigInteger(st.nextToken(),b);

            BigInteger remainder = p.remainder(m);
            bw.write(Integer.toString(remainder.intValue(), b));

            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
