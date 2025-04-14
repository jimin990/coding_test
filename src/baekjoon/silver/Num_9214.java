package baekjoon.silver;

import java.io.*;

public class Num_9214 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new BufferedWriter(new OutputStreamWriter(System.out)));

        int i = 0;

        while(true){

            String str = br.readLine();
            StringBuilder sB = new StringBuilder();

            if(str.equals("0")) break;

            while(str.length()%2 == 0 ){

                String before = str;
                for(int j =0 ;j<str.length();j+=2 ){

                    sB.append(String.valueOf(str.charAt(j+1)).repeat(Character.getNumericValue(str.charAt(j))));
                }
                str = String.valueOf(sB);

                if(before.equals(str)){
                    break;
                }
                sB.setLength(0);
            }

            bw.write("Test " + ++i + ": " + str);
            bw.newLine();

        }

        bw.flush();
        bw.close();

    }
}
