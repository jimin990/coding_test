package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력
 * 배열로 처리해서 바로 처리
 */
public class Num_2475 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");

        double result = Math.pow(Integer.parseInt(str[0]),2) +
                        Math.pow(Integer.parseInt(str[1]),2) +
                        Math.pow(Integer.parseInt(str[2]),2) +
                        Math.pow(Integer.parseInt(str[3]),2) +
                        Math.pow(Integer.parseInt(str[4]),2);

        System.out.println((int)result%10);
    }
}
