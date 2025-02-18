package baekjoon.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Num_5073 {
    public static void main(String[] args) throws IOException {
        
        /**
         * Equilateral :  세 변의 길이가 모두 같은 경우
         * Isosceles : 두 변의 길이만 같은 경우
         * Scalene : 세 변의 길이가 모두 다른 경우
         * Invalid: 가장 긴변의 길이보다 나머지 두변의 길이의 합이 길지 않는 경우
         */

        /**
         * 입력: 3배열로 받음
         * 0일 경우 종료
         *
         * 1. 크기 별로 재배열하고 Invali검증
         * 2. 각각 검증해서 같으면 status 1증가
         * 마지막 status 보고 상태 출력
         */

        //입력
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strs;
        List<Integer> arr;

        while (true) {

            arr = new ArrayList<>();

            int stutus = 0;
            strs = br.readLine().split(" ");
            for (int i = 0; i < strs.length; i++) {
                arr.add(Integer.parseInt(strs[i]));
            }
            Collections.sort(arr);

            if(arr.contains(0)){
                return;
            }else if (arr.get(2) >= (arr.get(0) + arr.get(1))){
                System.out.println("Invalid");
            }else{
                if(Objects.equals(arr.get(0), arr.get(1))) stutus++;

                if(Objects.equals(arr.get(0), arr.get(2))) stutus++;

                if(Objects.equals(arr.get(1), arr.get(2))) stutus++;

                switch (stutus){
                    case 0: System.out.println("Scalene");
                        break;
                    case 1: System.out.println("Isosceles");
                        break;
                    case 3: System.out.println("Equilateral");
                        break;
                }
            }

        }

    }
}
