package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_4696 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        while (!str.equals("0")) {

            double s = Double.parseDouble(str);
            Double result = 1 + s + Math.pow(s, 2) + Math.pow(s, 3) + Math.pow(s, 4);
            System.out.printf("%.2f\n",Math.round(result * 100) / 100.0);
            str = br.readLine();

        }
    }
}
