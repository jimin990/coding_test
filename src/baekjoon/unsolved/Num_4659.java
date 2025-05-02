package baekjoon.unsolved;

import java.io.*;

public class Num_4659 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while(true){

            String str = br.readLine();


            if (str.equals("end")) {
                bw.flush();
                bw.close();
                return;
            }else{
                if(one(str) && two(str) && three(str)){
                    bw.write("<" + str + ">" + " is acceptable.");
                    bw.newLine();
                }else{
                    bw.write("<" + str + ">" + " is not acceptable.");
                    bw.newLine();
                }
            }



        }
    }

    public static boolean one(String str){

        String test = "aeiou";

        for (int i = 0; i < test.length(); i++) {
            if(str.contains(String.valueOf(test.charAt(i)))){
                return true;
            }
        }

        return false;
    }

    public static boolean two(String str){

        String test = "aeiou";

        if(str.length() <3) return true;

        int con = 0;
        for (int i = 0; i < str.length(); i++) {
            if(test.contains(String.valueOf(str.charAt(i)))){
                con++;
            }else{
                con=0;
            }

            if(con == 3){
                return false;
            }
        }

        con = 0;
        for (int i = 0; i < str.length(); i++) {
            if(!test.contains(String.valueOf(str.charAt(i)))){
                con++;
            }else{
                con=0;
            }

            if(con == 3){
                return false;
            }
        }


        return true;
    }

    public static boolean three(String str){

        if(str.length() < 2){
            return true;
        }

        for (int i = 1; i < str.length(); i++) {
            if(str.charAt(i-1) == str.charAt(i)){
                if(!(str.charAt(i) == 'e') && !(str.charAt(i) == 'o')){
                    return false;
                }
            }
        }

        return true;
    }
}
