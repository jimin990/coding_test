package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_14709 {
    public static void main(String[] args) throws IOException {
        /**
         * 5번과 2 번이 있으면 실패
         * 13 43 14 가 필수
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int status = 0;

        if(N==3){

            for (int i = 0; i < N; i++) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int finger1 = Integer.parseInt(st.nextToken());
                int finger2 = Integer.parseInt(st.nextToken());
                if((finger1 == 1 && finger2 == 3) ||(finger1 == 4 && finger2 == 3)||(finger1 == 1 && finger2 == 4)||(finger1 == 3 && finger2 == 1) ||(finger1 == 3 && finger2 == 4)||(finger1 == 4 && finger2 == 1) ){
                }else{
                    status=1;
                }
            }

            if(status ==0){
                bw.write("Wa-pa-pa-pa-pa-pa-pow!");
            }else{
                bw.write("Woof-meow-tweet-squeek");
            }
        }else{
            bw.write("Woof-meow-tweet-squeek");
        }

        bw.flush();
        bw.close();


    }
}
