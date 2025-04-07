package baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_1059 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int L = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[L];
        for (int i = 0; i <L; i++) {
            arr[i] = Integer.parseInt(st.nextToken());
            if(arr[i] == n){
                bw.write("0");
                bw.flush();
                bw.close();
                return;
            }
        }

        Arrays.sort(arr);

        for (int i = 0; i < L; i++) {

            if(n < arr[i]){
                if(i==0){
                    bw.write(String.valueOf(n-1 + arr[i]-n-1 + (arr[i]-n-1)*(n-1)));
                }else{
                    bw.write(String.valueOf(n-arr[i-1]-1 + arr[i]-n-1+ (arr[i]-n-1)*(n-arr[i-1]-1)));
                }

                break;
            }
        }

        bw.flush();
        bw.close();
    }
}
