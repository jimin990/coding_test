package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 1 1 0 1 0
 * 0 0 1 0 1
 *
 * Y
 *
 * 배열을 두개 만들고 각 배열을 같은 부분이 있으면 N, 없다면 Y 출력
 */
public class Num_10395 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] arr1 = br.readLine().split(" ");
        String[] arr2 = br.readLine().split(" ");

        for (int i = 0; i < 5; i++) {
            if (arr1[i].equals(arr2[i])) {
                System.out.println("N");
                return;
            }
        }

        System.out.println("Y");
    }
}
