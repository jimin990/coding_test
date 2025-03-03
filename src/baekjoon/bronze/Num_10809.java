package baekjoon.bronze;

import java.io.*;
import java.util.Arrays;

public class Num_10809 {
    public static void main(String[] args) throws IOException {

        /**
         * 입력을 받고
         * 97 = a
         * 97이 0이 되려면 -97
         * 처음 -1 초기화하고 -1이면 값을 주고 아니면 주지말자
         * 받은 것들을 루프돌려서 i 값을 -97한 값 배열에 넣어주기
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();
        int[] arr = new int[26];
        Arrays.fill(arr,-1);

        for (int i = 0; i < str.length(); i++) {
            if(arr[(str.charAt(i)-97)] == -1){
                arr[(str.charAt(i)-97)] = i;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            bw.write(String.valueOf(arr[i]) +" ");
        }

        bw.flush();
        bw.close();

    }
}
