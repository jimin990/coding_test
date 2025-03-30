package baekjoon.bronze;

import java.io.*;

public class Num_2816 {
    public static void main(String[] args) throws IOException {
        /**
         * 배열에 넣을 필요 X KBS1의 나온 수와 2 나온 수를 각각 계산하고 1과 4를 해준다.
         *
         * 이때 2의 4는 한칸 아래에 해줘야하고, 1이 아래에 있을때는 그냥 두고 더 위에 있을 때는 1더해준다.
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int KBS1 = 0;
        int KBS2 = 0;

        for (int i = 0; i <N; i++) {
            String s = br.readLine();

            if(s.equals("KBS1")){
                KBS1 = i;
            }else if(s.equals("KBS2")){
                KBS2 = i;
            }
        }

        if (KBS1 > KBS2) {
            KBS2++;
        }

        bw.write("1".repeat(KBS1));
        bw.write("4".repeat(KBS1));
        bw.write("1".repeat(KBS2));
        bw.write("4".repeat(KBS2-1));
        bw.flush();
        bw.close();
    }
}
