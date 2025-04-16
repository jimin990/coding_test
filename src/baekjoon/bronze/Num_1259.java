package baekjoon.bronze;

import java.io.*;

public class Num_1259 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){

            String str = br.readLine();
            StringBuilder sB = new StringBuilder(str);

            if(str.equals("0")){break;}
            else {
                if(str.contentEquals(sB.reverse())){
                    bw.write("yes");
                    bw.newLine();
                }else{
                    bw.write("no");
                    bw.newLine();
                }
            }
        }

        bw.flush();
        bw.close();
    }
}
