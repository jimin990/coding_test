package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_32314 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int tree_ampere = Integer.parseInt(br.readLine());

        String[] secondLine = br.readLine().split(" ");

        int watt = Integer.parseInt(secondLine[0]);
        int volt =Integer.parseInt(secondLine[1]);

        int adapter_ampere = watt / volt;

        if (adapter_ampere >= tree_ampere) {
            System.out.println(1);
        }else System.out.println(0);
    }
}
