package baekjoon.bronze;

import java.io.*;

public class Num_25501 {
    static int num =0;
    public static void main(String[] args) throws IOException {
        /**
         *
         * #include <stdio.h>
         * #include <string.h>
         *
         * int recursion(const char *s, int l, int r){
         *     if(l >= r) return 1;
         *     else if(s[l] != s[r]) return 0;
         *     else return recursion(s, l+1, r-1);
         * }
         *
         * int isPalindrome(const char *s){
         *     return recursion(s, 0, strlen(s)-1);
         * }
         *
         * int main(){
         *     printf("ABBA: %d\n", isPalindrome("ABBA")); // 1
         *     printf("ABC: %d\n", isPalindrome("ABC"));   // 0
         * }
         *
         */

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        for (int i = 0; i < N; i++) {
            String str = br.readLine();
            int isPali = isPalindrome(str);
            bw.write(isPali +" "+ num);
            bw.newLine();
            num=0;
        }

        bw.flush();
        bw.close();

    }

    static int recursion(String str, int l, int r){
        num++;
        if(l >= r) return 1;
        else if(str.charAt(l) != str.charAt(r)) return 0;
        else return recursion(str, l+1, r-1);
    }

    static int isPalindrome(String str){
        return recursion(str, 0, str.length()-1);
    }
}
