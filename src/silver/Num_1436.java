package silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_1436 {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));
        int N = Integer.parseInt(br.readLine());

        int count =1;

        int NoA = 666;

        while (count != N) {


            ++NoA;

            String s = String.valueOf(NoA);
            if(s.contains("666")){
                count++;
            }

        }

        System.out.println(NoA);
    }
}

/**
 * N =1
 * 666부터 증가시켜서 666이 있을때 N을 1증가
 * N이 받은 수 와 같은때 출력
 */