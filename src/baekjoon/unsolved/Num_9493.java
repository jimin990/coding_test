package baekjoon.unsolved;

import java.io.*;
import java.util.StringTokenizer;

public class Num_9493 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while(true){


            StringTokenizer st = new StringTokenizer(br.readLine());


            float M = Float.parseFloat(st.nextToken());
            float A = Float.parseFloat(st.nextToken());
            float B = Float.parseFloat(st.nextToken());

            if(M==0)break;

            A = M / A * 60;
            B = M / B * 60;

            System.out.println("B = " + B + "A : " + A );
            float time = A - B;

            System.out.println("time = " + time);

        }
    }
}
