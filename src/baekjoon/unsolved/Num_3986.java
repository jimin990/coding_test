package baekjoon.unsolved;

import java.io.*;

public class Num_3986 {
    public static void main(String[] args) throws IOException {

        String str1 = "AAA";
        String string = str1.replaceAll("AA", "");
        System.out.println("string = " + string);

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int result =0;
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            char word = str.charAt(0);

            int good =0;
            for (int j = 1; j < str.length(); j++) {
                if(word ==  str.charAt(j)){
                    if(good%2 ==0){
                        if(j+1 < str.length()){

                            word = str.charAt(j+1);
                            good=0;
                        }
                    }else{
                        break;
                    }

                }else{
                    good++;
                }
            }
            result++;

        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
