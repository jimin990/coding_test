package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력 배열 크기, X 보다 작은 수
 *
 * 배열을 만들고 정렬 한후
 * 끝까지 돌리고, 만약 x보다 큰 수 면 return
 */

public class

Num_10871 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int X = Integer.parseInt(str[1]);

        String[] arr1 = br.readLine().split(" ");
        int[] arr2 = new int[N];

        for (int i = 0; i < N; i++) {
            arr2[i] = Integer.parseInt(arr1[i]);
        }


        for (int s: arr2) {
            if( s >= X){
            }else System.out.print(s +" ");
        }
    }
}
