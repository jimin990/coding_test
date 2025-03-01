package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_23802 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N*5; i++) {
            if(i<N){
                System.out.println("@".repeat(N*5));
            }else{
                System.out.println("@".repeat(N));
            }
        }
    }
}
