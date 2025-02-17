package bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 입력을 받고,
 * N : 참여하는 인원 수
 * M : 공을 받은 수 -> 한 사람이 공을 받은 수
 * L : 공을 패스할 위치 - 받은 횟수가 홀수 : 시계 방향 / 짝수 : 반시계
 *  총 패스를 몇번 했는지 출력
 *
 * 원으로 둘러싸있기 때문에
 * 배열을 이용
 *
 * 홀수 일 경우: 현재 위치에서 -L
 * 만약 배열이 0보다 작아질 경우 현재 위치에서 빼고
 * 예)
 * 총 배열 10
 * 현재 위치 5
 * 홀수 6 빼면
 * 위치해야하는 곳 8
 *
 * 9 = 10 + 5 - 6
 * 결과 = 총 배열 + 현재 위치 - L
 *
 * 짝수 일 경우: 현재 위치에서 + L
 * 만약 배열 크기보다 커질 경우
 * 예)
 * 총 배열 10
 * 현재 위치 5
 * 홀수 6 더하면
 * 위치해야하는 곳 1
 *
 * 1 = 5 + 6 - 10
 * 결과 = 현재위치 + L - 총 배열
 *
 */
public class Num_1592 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] set = br.readLine().split(" ");

        int N = Integer.parseInt(set[0]);
        int M = Integer.parseInt(set[1]);
        int L = Integer.parseInt(set[2]);

        int[] arr = new int[N];

        int sumPass = 0;

        int i =0;
        arr[0] += 1;

        while (arr[i] != M) {
            sumPass++;
            //짝수 일 경우
            if(arr[i]/2 == 0){
                //배열 보다 큰 경우
                if(i+L>=N){
                    i= i + L -N;
                }else {
                    i=i+L;
                }
                arr[i]+=1;
            }else{//홀수 일 경우
                if(i-L<0){
                    i = N + i -L;
                }else {
                    i=i-L;
                }
                arr[i]+=1;
            }
        }

        System.out.println(sumPass);


    }
}
