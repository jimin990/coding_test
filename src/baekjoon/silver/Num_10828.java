package baekjoon.silver;

import java.io.*;
import java.util.Stack;
import java.util.StringTokenizer;

public class Num_10828 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        Stack<Integer> stack = new Stack<>();

        for (int i = 0; i < N; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());

            String command = st.nextToken();

            if (command.equals("push")) {
                int X = Integer.parseInt(st.nextToken());
                stack.push(X);
            }else if(command.equals("pop")){
                if(stack.empty()){

                    bw.write("-1");
                }else{
                    bw.write(String.valueOf(stack.pop()));
                }
                bw.newLine();
            }else if(command.equals("size")){
                bw.write(String.valueOf(stack.size()));
                bw.newLine();
            }else if(command.equals("empty")){
                if(stack.empty()){
                    bw.write("1");
                }else{
                    bw.write("0");
                }

                bw.newLine();
            }else if(command.equals("top")){
                if(stack.empty()){
                    bw.write("-1");
                }else{
                    bw.write(String.valueOf(stack.peek()));
                }
                bw.newLine();
            }

        }

        bw.flush();
        bw.close();
    }
}
