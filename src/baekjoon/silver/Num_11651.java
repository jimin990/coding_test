package baekjoon.silver;

import java.io.*;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Num_11651 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Xy[] arr = new Xy[N];

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            Xy xy = new Xy();

            xy.x = Integer.parseInt(st.nextToken());
            xy.y = Integer.parseInt(st.nextToken());

            arr[i] = xy;

        }

        Arrays.sort(arr, new Comparator<Xy>() {
            @Override
            public int compare(Xy o1, Xy o2) {

                if(o1.y == o2.y){
                    return o1.x-o2.x;
                }else{
                    return o1.y - o2.y;
                }
            }
        });

        for (Xy xy : arr) {
            bw.write(xy.x + " " + xy.y);
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }


}

class Xy{
    int x;
    int y;
}
