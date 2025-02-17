package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * 0 32
 * 3 13
 * 28 25
 * 17 5
 * 21 20
 * 11 0
 * 12 12
 * 4 2
 * 0 8
 * 21 0
 *
 * 가장 많은 사람이 타있는 경우를 출력
 * 내릴사람 내린 후 사람이 탄다.
 *
 * 배열에 탄 사람과 있는 사람들을 넣고
 * 정렬해서 출력
 *
 */
public class Num_2460 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[] arr = new int[10];

        for (int i = 0; i < 10; i++) {
            String[] str = br.readLine().split(" ");

            if(i==0){
                arr[i] += Integer.parseInt(str[1]);
                arr[i] -= Integer.parseInt(str[0]);
            }else {
                arr[i] += arr[i - 1];
                arr[i] += Integer.parseInt(str[1]);
                arr[i] -= Integer.parseInt(str[0]);
            }
        }

        Arrays.sort(arr);
        System.out.println(arr[9]);
    }
}
