package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Num_2562 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[9];
        int[] arr1 = new int[9];

        for(int i =0;i<9;i++){

            int j = Integer.parseInt(br.readLine());
            arr[i] = j;
            arr1[i] = j;
        }


        Arrays.sort(arr1);

        for (int i = 0; i < 9; i++) {

            if(arr1[8] == arr[i]){
                System.out.println(arr[i]);
                System.out.print(i+1);
            }
        }

    }
}
