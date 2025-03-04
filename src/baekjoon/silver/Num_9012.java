package baekjoon.silver;

import java.io.*;

public class Num_9012 {
    public static void main(String[] args) throws IOException {
        /**
         *
         * 처음이 ) 경우는 무조건 X
         * 1.스택 사용
         * 2.(가 나오면 다음에 나오는 ) 없애기
         *
         */
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int T = Integer.parseInt(br.readLine());

        for (int k = 0; k < T; k++) {

            String str = br.readLine();

            char[] arr = str.toCharArray();

            if(arr[0] ==')'){
                bw.write("NO");
                bw.newLine();
            }else{
                for (int i = 0; i < str.length(); i++) {
                    if(arr[i] == '('){


                        for (int j = i+1; j < str.length(); j++) {
                            if(arr[j] == ')'){
                                arr[i] = '0';
                                arr[j] ='0';
                                break;
                            }
                        }

                    }

                }
                String string = String.valueOf(arr);
                String replace = string.replace("0", "");

                if(replace.isEmpty()){
                    bw.write("YES");
                    bw.newLine();
                } else {
                    bw.write("NO");
                    bw.newLine();
                }
            }

        }


        bw.flush();
        bw.close();



    }
}
