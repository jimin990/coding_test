package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Num_21921 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(st.nextToken());

        int[] arr = new int[N];
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
        }

        int slidingWindow = 0;
        for (int j = 0; j < X; j++) {
            slidingWindow+=arr[j];
        }

        int max = slidingWindow;
        int num =1;

        for (int i = 1; i < N-X+1; i++) {

            slidingWindow = slidingWindow - arr[i-1] + arr[i + X-1];

            if(max<slidingWindow){
                max = slidingWindow;
                num=1;
            }else if(max==slidingWindow){
                num++;
            }

        }

        if(max == 0){
            bw.write("SAD");
        }else{
            bw.write(String.valueOf(max));
            bw.newLine();
            bw.write(String.valueOf(num));
        }

        bw.flush();
        bw.close();
    }
}
