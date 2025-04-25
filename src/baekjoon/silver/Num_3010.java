package baekjoon.silver;

import java.io.*;

public class Num_3010 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        char[][] arr = new char[7][7];

        for (int i = 0; i < 7; i++) {
            String str = br.readLine();
            for (int j = 0; j < 7; j++) {
                arr[i][j] = str.charAt(j);
            }
        }

        int result = 0;

        for (int i = 0; i < 7; i++) {
            for (int j = 0; j < 7; j++) {

                if(arr[i][j] == 'o'){

                    if(j+2 < 7 ){
                        if ((arr[i][j + 1]) == 'o' && arr[i][j + 2] == '.') {
                            result++;
                        }
                    }

                    if(j-2 >= 0 ){
                        if ((arr[i][j - 1]) == 'o' && arr[i][j - 2] == '.') {
                            result++;
                        }
                    }

                    if(i+2 < 7 ){
                        if ((arr[i+1][j]) == 'o' && arr[i+2][j] == '.') {
                            result++;
                        }
                    }

                    if(i-2 >=0 ){
                        if ((arr[i-1][j]) == 'o' && arr[i-2][j] == '.') {
                            result++;
                        }
                    }

                }


            }
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();

    }
}
