package baekjoon.bronze;

import java.io.*;
import java.util.StringTokenizer;

public class Num_30008 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] str = br.readLine().split(" ");
        int N = Integer.parseInt(str[0]);
        int K = Integer.parseInt(str[1]);

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i =0; i<K;i++){

            int P = Integer.parseInt(st.nextToken());

            P=(P*100)/N;

            if(0<= P && P <= 4){
                bw.write("1");
            } else if(4< P && P <= 11){
                bw.write("2");
            }else if(11< P && P <= 23){
                bw.write("3");
            }else if(23< P && P <= 40){
                bw.write("4");
            }else if(40< P && P <=60){
                bw.write("5");
            }else if(60< P && P <= 77){
                bw.write("6");
            }else if(77< P && P <= 89){
                bw.write("7");
            }else if(89< P && P <= 96){
                bw.write("8");
            }else if(96< P && P <= 100){
                bw.write("9");
            }

            bw.write(" ");
        }

        bw.flush();
        bw.close();

    }
}
