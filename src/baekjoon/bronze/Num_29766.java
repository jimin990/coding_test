package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_29766 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.replace("DKSH", "0");

        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i) == '0'){
                count++;
            }
        }


        System.out.println(count);
    }

}
