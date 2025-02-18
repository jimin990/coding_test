package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 언제 종료되는지 모르겠음
 *
 */
public class Num_10951 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str;
        while ((str = br.readLine()) != null) {
            String[] str2 = str.split(" ");

            int A = Integer.parseInt(str2[0]);
            int B = Integer.parseInt(str2[1]);
            System.out.println(A+B);
        }


    }
}
