package baekjoon.silver;

import java.io.*;

public class Num_15721 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 한 루프가 뻔 데기 뻔 데기
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int T = Integer.parseInt(br.readLine());
        int B = Integer.parseInt(br.readLine());

        int seq = 0;// 현재 순서
        int bbun = 0;// 뻔이 나온 수
        int degy = 0;// 데기가 나온 수

        if(B ==0){
            for (int i = 2; i < 10000; i++) {
                // 뻔
                bbun++;
                if(bbun == T){
                    System.out.println(seq);
                    return;
                }
                seq++;
                if(seq >= A){
                    seq=0;
                }

                //데기
                seq++;
                if(seq >= A){
                    seq=0;
                }

                // 뻔
                bbun++;
                if(bbun == T){
                    System.out.println(seq);
                    return;
                }
                seq++;
                if(seq >= A){
                    seq=0;
                }

                //데기
                seq++;
                if(seq >= A){
                    seq=0;
                }

                // 뻔뻔
                for (int j = 0; j < i; j++) {
                    // 뻔
                    bbun++;
                    if(bbun == T){
                        System.out.println(seq);
                        return;
                    }
                    seq++;
                    if(seq >= A){
                        seq=0;
                    }
                }

                // 데기데기
                for (int j = 0; j < i; j++) {
                    seq++;
                    if(seq >= A){
                        seq=0;
                    }
                }
            }
        }else{
            for (int i = 2; i < 10000; i++) {
                //뻔
                seq++;
                if(seq >= A){
                    seq=0;
                }

                // 데기
                degy++;
                if(degy == T){
                    System.out.println(seq);
                    return;
                }
                seq++;
                if(seq >= A){
                    seq=0;
                }

                //뻔
                seq++;
                if(seq >= A){
                    seq=0;
                }

                //데기
                degy++;
                if(degy == T){
                    System.out.println(seq);
                    return;
                }
                seq++;
                if(seq >= A){
                    seq=0;
                }

                // 뻔뻔
                for (int j = 0; j < i; j++) {
                    seq++;
                    if(seq >= A){
                        seq=0;
                    }
                }

                // 데기데기
                for (int j = 0; j < i; j++) {
                    degy++;
                    if(degy == T){
                        System.out.println(seq);
                        return;
                    }
                    seq++;
                    if(seq >= A){
                        seq=0;
                    }
                }
            }
        }
    }
}
