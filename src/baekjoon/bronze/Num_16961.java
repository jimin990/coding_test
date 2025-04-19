package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_16961 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int one = 0;
        int two = 0;
        int three = 0;
        int four = 0;

        int five = 0;
        String[][] str = new String[N][367];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String c = st.nextToken();

            int s = Integer.parseInt(st.nextToken());
            int e = Integer.parseInt(st.nextToken());

            five = Math.max(five, e - s + 1);

            for (int j = 1; j <= 366; j++) {

                if (s <= j && j <= e) {
                    str[i][j] = c;
                } else {
                    str[i][j] = "1";
                }
            }

        }


        for (int i = 1; i <= 366; i++) {

            int todayStay = 0;
            int tPerson = 0;
            int sPerson = 0;

            for (int j = 0; j < N; j++) {
                if (!str[j][i].equals("1")) {
                    todayStay++;
                }

                if (str[j][i].equals("T")) {
                    tPerson++;
                } else if (str[j][i].equals("S")) {
                    sPerson++;
                }
            }

            if (todayStay > 0) {
                one++;
            }

            two = Math.max(two, todayStay);


            if (tPerson + sPerson != 0) {


                if (tPerson == sPerson) {
                    three++;
                    four = Math.max(four, todayStay);
                }
            }

        }

        bw.write(String.valueOf(one));
        bw.newLine();
        bw.write(String.valueOf(two));
        bw.newLine();
        bw.write(String.valueOf(three));
        bw.newLine();
        bw.write(String.valueOf(four));
        bw.newLine();
        bw.write(String.valueOf(five));
        bw.flush();
        bw.close();


    }
}
