package baekjoon.silver;

import java.io.*;
import java.util.StringTokenizer;

public class Num_16506 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;

        for (int i = 0; i < N; i++) {

            StringBuilder sb = new StringBuilder();

            st = new StringTokenizer(br.readLine());

            String opcode = st.nextToken();

            int rD = Integer.parseInt(st.nextToken());
            int rA = Integer.parseInt(st.nextToken());
            int rBC = Integer.parseInt(st.nextToken());


            // 0~4
            if(opcode.contains("ADD")){
                sb.append("0000");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("SUB")){
                sb.append("0001");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("MOV")){
                sb.append("0010");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("AND")){
                sb.append("0011");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("OR")){
                sb.append("0100");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("NOT")){
                sb.append("0101");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("MULT")){
                sb.append("0110");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("LSFTL")){
                sb.append("0111");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("LSFTR")){
                sb.append("1000");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("ASFTR")){
                sb.append("1001");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("RL")){
                sb.append("1010");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }else if(opcode.contains("RR")){
                sb.append("1011");
                if(opcode.contains("C")){
                    sb.append("1");
                }else sb.append("0");

            }

            // 5
            sb.append("0");

            // 6~8
            sb.append(String.format("%03d",Integer.parseInt(Integer.toBinaryString(rD))));

            // 9~11
            if (rA == 0) {
                sb.append("000");
            } else sb.append(String.format("%03d",Integer.parseInt(Integer.toBinaryString(rA))));

            // 12~15
            if(sb.charAt(4) == '0'){
                sb.append(String.format("%03d",Integer.parseInt(Integer.toBinaryString(rBC))));
                sb.append("0");
            }else {
                sb.append(String.format("%04d",Integer.parseInt(Integer.toBinaryString(rBC))));
            }

            bw.write(String.valueOf(sb));
            bw.newLine();
        }

        bw.flush();
        bw.close();
    }
}
