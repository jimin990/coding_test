package baekjoon.tryAgain;

import java.io.*;
import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.StringTokenizer;

public class Num_29753 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());

        BigDecimal K = new BigDecimal(st.nextToken());

        BigDecimal sum = BigDecimal.ZERO;
        int num = 0;

        for (int i = 0; i < N - 1; i++) {
            st = new StringTokenizer(br.readLine());

            int point = Integer.parseInt(st.nextToken());

            String score = st.nextToken();

            BigDecimal s = BigDecimal.ZERO;
            switch (score) {
                case "A+": s = new BigDecimal("4.50"); break;
                case "A0": s = new BigDecimal("4.00"); break;
                case "B+": s = new BigDecimal("3.50"); break;
                case "B0": s = new BigDecimal("3.00"); break;
                case "C+": s = new BigDecimal("2.50"); break;
                case "C0": s = new BigDecimal("2.00"); break;
                case "D+": s = new BigDecimal("1.50"); break;
                case "D0": s = new BigDecimal("1.00"); break;
                case "F": s = new BigDecimal("0.00"); break;
            }

            sum = sum.add(s.multiply(new BigDecimal(point)));
            num += point;
        }

        BigDecimal[] arr = {
                new BigDecimal("4.50"), new BigDecimal("4.00"), new BigDecimal("3.50"),
                new BigDecimal("3.00"), new BigDecimal("2.50"), new BigDecimal("2.00"),
                new BigDecimal("1.50"), new BigDecimal("1.00"), new BigDecimal("0.00")
        };

        int p = Integer.parseInt(br.readLine());
        num += p;

        String s = "impossible";
        for (int i = 8; i >= 0; i--) {

            BigDecimal result = sum.add(arr[i].multiply(new BigDecimal(p))).divide(new BigDecimal(num), 3, RoundingMode.FLOOR);
            result = result.setScale(2, RoundingMode.FLOOR);

            if (result.compareTo(K) > 0) {
                switch (i) {
                    case 0: s = "A+"; break;
                    case 1: s = "A0"; break;
                    case 2: s = "B+"; break;
                    case 3: s = "B0"; break;
                    case 4: s = "C+"; break;
                    case 5: s = "C0"; break;
                    case 6: s = "D+"; break;
                    case 7: s = "D0"; break;
                    case 8: s = "F"; break;
                }
                break;
            }
        }

        bw.write(s);
        bw.flush();
        bw.close();
    }
}
