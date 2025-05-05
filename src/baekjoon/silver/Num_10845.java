package baekjoon.silver;

import java.io.*;
import java.util.*;

public class Num_10845 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayDeque queue = new ArrayDeque<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                queue.addFirst(X);
            } else if (command.equals("pop")) {
                if (queue.isEmpty()) {

                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(queue.pollLast()));
                }
                bw.newLine();
            } else if (command.equals("size")) {
                bw.write(String.valueOf(queue.size()));
                bw.newLine();
            } else if (command.equals("empty")) {
                if (queue.isEmpty()) {
                    bw.write("1");
                } else {
                    bw.write("0");
                }

                bw.newLine();
            } else if (command.equals("front")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(queue.getLast()));
                }
                bw.newLine();
            } else if (command.equals("back")) {
                if (queue.isEmpty()) {
                    bw.write("-1");
                } else {
                    bw.write(String.valueOf(queue.getFirst()));
                }
                bw.newLine();

            }
        }
        bw.flush();
        bw.close();
    }
}
