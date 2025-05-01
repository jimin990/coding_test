package baekjoon.unsolved;

import java.io.*;

public class Num_4659 {
    public static void main(String[] args) throws IOException {


        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        loop1:while(true){

            String str = br.readLine();

            String mo = "a,e,i,o,u";


            // end
            if (str.equals("end")) {
                bw.flush();
                bw.close();
                return;
            }else{
                // 1
                if(str.contains("a") || str.contains("e") ||str.contains("i") ||str.contains("o") ||str.contains("u")){
                    // 2

                    for (int i = 2; i < str.length(); i++) {
                        if(mo.contains(String.valueOf(str.charAt(i-2))) && mo.contains(String.valueOf(str.charAt(i-1))) && mo.contains(String.valueOf(str.charAt(i))) || (!mo.contains(String.valueOf(str.charAt(i-2))) && !mo.contains(String.valueOf(str.charAt(i-1))) && !mo.contains(String.valueOf(str.charAt(i))))){
                            bw.write("<" + str + ">" + " is not acceptable");
                            bw.newLine();
                            continue loop1;
                        }
                    }

                    for (int i = 1; i < str.length(); i++) {
                        if(str.charAt(i-1) == str.charAt(i)){
                            if(!(str.charAt(i)== 'e') || !(str.charAt(i)== 'o')){
                                bw.write("<" + str + ">" + " is not acceptable");
                                bw.newLine();
                                continue loop1;
                            }
                        }
                    }

                }else{
                    bw.write("<" + str + ">" + " is not acceptable");
                    bw.newLine();
                    continue;
                }
            }

            bw.write("<" + str + ">" + " is acceptable");
            bw.newLine();

        }
    }
}
