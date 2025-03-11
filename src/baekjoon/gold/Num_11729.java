package baekjoon.gold;


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_11729 {
    static int num = 0;
    static BufferedWriter bw;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        func(1,3,n);

    }

    static void func(int a, int b, int n) throws IOException {
        if(n==1){
            num++;
            return;
        }

        func(a,b,1);
    }
}