package baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Num_1654 {
    /**
     * 현재 가지고 있는 랜선의 개수 K개를 입력 받고 , 그 다음 필요한 랜선의 N개가 입력된다.
     * 이후 가지고 있는 랜선의 길이 들이 K개 입력된다
     * <p>
     * 목표: N개 만큼 랜선을 자르는데 가장 길게 잘라야한다.
     * <p>
     * 붙힐수 없으니 가장 단순하게 최소로 자르는 건
     * 내가 가진 랜선 중 가장 작은 것의 길이를 기준으로 자르는 것이다.
     * 제일 작은걸 기준으로 1식 줄여가면서 빼지는지 확인하면서 11이 되면 출력하기.
     * --이건 실행 시간이 너무 걸린다.
     * <p>
     * 다 더하고 K를 나눈다.
     * 2541 / 11 = 가 제일 최대값 그 다음 부터 1 씩 감소시키면서 검증
     *
     * 줄이 있고최대한 큰 걸로자르라고 할때 브루트포스로 하면 시간이 초과된다,
     * 그러면 계산 수를 줄이자.
     * 안되면 가장 큰수에서 하나를 더 나눌수 있도록 만들어야한다.
     * 우선 제일 큰 수로 나누는 수를 정하고 나눗셈을 진행하자.
     */
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        Integer[] arr = new Integer[K];


        for (int i = 0; i < K; i++) {
            arr[i] = Integer.parseInt(br.readLine());

        }

        Arrays.sort(arr);

        long max = arr[K-1];
        long min = 1;
        long mid = (max + min) / 2;

        while(min <= max){

            long n = 0;
            mid = (max + min) / 2;
            for (int i = 0; i < K; i++) {
                n += (arr[i] / mid);
            }

            if(n < N){
                max = mid-1;
            }else{
                min = mid+1;
            }
        }

        bw.write(String.valueOf(min));
        bw.flush();
        bw.close();

    }
}
