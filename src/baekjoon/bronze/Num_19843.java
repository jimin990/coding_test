package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_19843 {
    public static void main(String[] args) throws IOException {
        /**
         * 같으면 그냥 h2 - h1 다르면 (24+h2) - h1
         * 을 다 더한 값을 sleep 에 넣고 빼는데
         * 만약 음수가 나오면 0, 48이상이 남으면 -1
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int T = Integer.parseInt(st.nextToken()); // 자야하는 시간
        int N = Integer.parseInt(st.nextToken()); //잠든 횟수

        int sleep = 0;

        for (int i = 0; i < N; i++) {


            StringTokenizer stN = new StringTokenizer(br.readLine());

            String D1 = stN.nextToken();
            int H1 = Integer.parseInt(stN.nextToken());
            String D2 = stN.nextToken();
            int H2 = Integer.parseInt(stN.nextToken());

            if(D1.equals("Mon")){

                if(D2.equals("Tue")){
                    sleep += (24 + H2) - H1;
                }else if(D2.equals("Wed")){
                    sleep += (48 + H2) - H1;
                }else if(D2.equals("Thu")){
                    sleep += (72 + H2) - H1;
                }else if(D2.equals("Fri")){
                    sleep += (96 + H2) - H1;
                }else{
                    sleep += H2 - H1;
                }


            }else if(D1.equals("Tue")){

                if(D2.equals("Wed")){
                    sleep += (24 + H2) - H1;
                }else if(D2.equals("Thu")){
                    sleep += (48 + H2) - H1;
                }else if(D2.equals("Fri")){
                    sleep += (72 + H2) - H1;
                }else{
                    sleep += H2 - H1;
                }

            }else if(D1.equals("Wed")){

                if(D2.equals("Thu")){
                    sleep += (24 + H2) - H1;
                }else if(D2.equals("Fri")){
                    sleep += (48 + H2) - H1;
                }else{
                    sleep += H2 - H1;
                }

            }else if(D1.equals("Thu")){

                if(D2.equals("Fri")){
                    sleep += (24 + H2) - H1;
                }else{
                    sleep += H2 - H1;
                }

            }else{
                sleep += H2 - H1;
            }


        }

        int result = T - sleep;

        if(result <= 0){
            bw.write("0");
        }else if(result > 48){
            bw.write("-1");
        }else{
            bw.write(String.valueOf(result));
        }

        bw.flush();
        bw.close();
    }
}
