package baekjoon.silver;

import java.io.*;
import java.util.HashMap;

public class Num_1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String str = br.readLine();

        str = str.toUpperCase();

        HashMap<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < str.length(); i++) {

            if(map.containsKey(str.charAt(i))){
                map.replace(str.charAt(i), map.get(str.charAt(i)) + 1);
            }else{
                map.put(str.charAt(i), 1);
            }
        }

        int num = 0;
        char ch = '0';

        for (Character c : map.keySet()) {

            if (num < map.get(c)) {
                ch = c;
                num = map.get(c);
            }
        }

        map.remove(ch);
        if (map.containsValue(num)) {
            bw.write("?");
        }else{
            bw.write(String.valueOf(ch));
        }

        bw.flush();
        bw.close();

    }
}
