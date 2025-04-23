package baekjoon.bronze;

import java.io.*;

public class Num_28702 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[3];

        for (int i = 0; i < 3; i++) {
            String str = br.readLine();
            if(!str.contains("Fizz")&&!str.contains("Buzz")){
                arr[i] = Integer.parseInt(str);
            }
        }

        int max =0;
        int maxN =0;

        for (int i = 0; i < 3; i++) {
            if(arr[i] !=0){
                if(max <=arr[i]){
                    maxN = i;
                    max = arr[i];
                }
            }
        }

        max += (3 - maxN);

        if((max%3 ==0) && (max%5 ==0)){
            bw.write("FizzBuzz");
        }else if((max%3 ==0) && !(max%5 ==0)){
            bw.write("Fizz");
        }else if(!(max%3 ==0) && (max%5 ==0)){
            bw.write("Buzz");
        }else{
            bw.write(String.valueOf(max));
        }

        bw.flush();
        bw.close();
    }
}
