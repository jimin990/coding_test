package baekjoon.unsolved;

import java.io.*;

public class Num_9625 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        //StringBuilder str =  new StringBuilder("A");

        String str = "A";



        for (int i = 1; i <=N; i++) {

            //StringBuilder sB = new StringBuilder();

            String sB ="";
            for (int j = 0; j < str.length(); j++) {
                if(str.charAt(j) == 'A'){
                    sB = sB.concat("B");
                }else{
                    sB = sB.concat("BA");
                }
            }

            /*str.setLength(0);
            str.append(sB);*/

            str = sB;

        }

        int A = 0;
        int B = 0;

        for (int i = 0; i < str.length(); i++) {

            char c = str.charAt(i);

            if(c == 'A'){
                A++;
            }else{
                B++;
            }
        }

        bw.write(A + " " + B);
        bw.flush();
        bw.close();
    }
}
