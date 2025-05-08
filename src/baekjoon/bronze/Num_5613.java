package baekjoon.bronze;

import java.io.*;

public class Num_5613 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int result = Integer.parseInt(br.readLine());

        while(true){

            String oper = br.readLine();

            if (oper.equals("+")) {
                result += Integer.parseInt(br.readLine());

            } else if (oper.equals("-")) {
                result -= Integer.parseInt(br.readLine());
            }else if (oper.equals("*")) {
                result *= Integer.parseInt(br.readLine());
            }else if (oper.equals("/")) {
                result /= Integer.parseInt(br.readLine());
            }else if (oper.equals("=")) {
                bw.write(String.valueOf(result));
                bw.flush();
                bw.close();
                return;
            }
        }
    }
}
