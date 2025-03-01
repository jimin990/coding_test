package baekjoon.bronze;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Num_2896 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


        String[] str = br.readLine().split(" ");
        String[] str1 = br.readLine().split(" ");

        double[] juice = new double[3];

        for (int i = 0; i < 3; i++) {
            juice[i] =Integer.parseInt(str[i]);
        }

        double[] juiceV = new double[3];

        for (int i = 0; i < 3; i++) {
            juiceV[i] =Integer.parseInt(str1[i]);
        }

        double min1 = Math.min((juice[0] / juiceV[0]), (juice[1] / juiceV[1]));
        double min = Math.min(min1, (juice[2] / juiceV[2]));

        System.out.printf("%.4f %.4f %.4f",juice[0]- (juiceV[0] * min),juice[1]- (juiceV[1] * min),juice[2]- (juiceV[2] * min));


    }
}
