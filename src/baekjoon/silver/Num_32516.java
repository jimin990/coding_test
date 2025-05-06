package baekjoon.silver;

import java.io.*;

public class Num_32516 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String T = br.readLine();


        int result = 0;

        if(N == 1){
            bw.write("0");
            bw.flush();
            bw.close();
            return;
        }

        if(N %2 ==0){
            String s1 = T.substring(0, N / 2);
            StringBuilder s2 = new StringBuilder(T.substring(N / 2));
            s2.reverse();

            for (int i = 0; i < N / 2; i++) {

                if(s1.charAt(i) == '?' && s2.charAt(i) == '?'){
                    result+=26;
                }else if(s1.charAt(i) == '?'){
                    result++;
                }else if(s2.charAt(i) == '?'){
                    result++;
                }else if(s1.charAt(i) != s2.charAt(i)){
                    bw.write("0");
                    bw.flush();
                    bw.close();
                    return;
                }else{

                }
            }

        }else{

            String s1 = T.substring(0, N / 2);
            StringBuilder s2 = new StringBuilder(T.substring(N / 2+1));
            s2.reverse();

            for (int i = 0; i < N / 2; i++) {

                if(s1.charAt(i) == '?' && s2.charAt(i) == '?'){
                    result+=26;
                }else if(s1.charAt(i) == '?'){
                    result++;
                }else if(s2.charAt(i) == '?'){
                    result++;
                }else if(s1.charAt(i) != s2.charAt(i)){
                    bw.write("0");
                    bw.flush();
                    bw.close();
                    return;
                }else{

                }
            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }
}
