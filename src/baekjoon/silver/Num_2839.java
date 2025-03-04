package baekjoon.silver;

import java.io.*;

public class Num_2839 {
    public static void main(String[] args) throws IOException {
        /**
         * 설탕의 양을 입력을 받는다.
         *
         * 더 작은 3과 5
         * 최대한 수량이 작게 들고 가기
         * 그러면 큰 봉지로 많이 들고간다.
         * 만약 큰봉지로 하고 3으로 안되면 5빼고 다시 3으로
         * 끝가지 안되면 -1
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int i =N/5;

        int j=N%5;

        int status =1;
        while(status == 1){

            if(j%3==0){
                i+=j/3;
                bw.write(String.valueOf(i));
                status =0;
            }else{
                i--;
                if(i<0){
                    bw.write("-1");
                    status =0;
                }
                j+=5;
            }

        }

        bw.flush();
        bw.close();

    }
}
