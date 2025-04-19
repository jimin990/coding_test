package baekjoon.tryAgain;

/*
import java.io.*;
<<<<<<< HEAD

public class Num_15829 {
    public static void main(String[] args) throws IOException {
=======
import java.math.BigInteger;

public class Num_15829 {
    */
/*public static void main(String[] args) throws IOException {
>>>>>>> 26a5c94 (48)

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

<<<<<<< HEAD
        int r = 31;
        int M = 1234567891;
        long result = 0;

        int N = Integer.parseInt(br.readLine());
        String str = br.readLine();

        for (int i = 0; i < N; i++) {
            int num = str.charAt(i) - 96;
            result = (result + (num * power(r, i, M)) % M) % M;  // ✅ 핵심 수정
            result += (num * power(r, i, M) % M) % M;
=======
        BigInteger r= new BigInteger("31");
        BigInteger m = new BigInteger("1234567891");

        int N = Integer.parseInt(br.readLine());

        String str = br.readLine();

        BigInteger result = new BigInteger("0");

        for (int i = 0; i < N ;i++) {

            BigInteger a = new BigInteger(String.valueOf(str.charAt(i)-96));
            BigInteger b = r.pow(i);
            result = result.add(a.multiply(b));
        }


        bw.write(String.valueOf(result.mod(m)));
        bw.flush();
        bw.close();

    }*//*


    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N  = Integer.parseInt(br.readLine());
        String str = br.readLine();
        int result = 0;

        for (int i = 0; i < N; i++) {
            int num = str.charAt(i) - 96;
            result += power(num);

>>>>>>> 26a5c94 (48)
        }

        bw.write(String.valueOf(result));
        bw.flush();
        bw.close();
    }

<<<<<<< HEAD
    static long power(int r,int i, int M){
        if(i == 0) return 1;

        long half = power(r, i / 2, M);
        long result = (half * half) % M;

        if(i % 2 == 1) result = (result * r) % M;

        return result;
    }
}
=======
    public static int power(int n){
        if(n==1){
            return (int) (Math.pow(31,n) %1234567891);
        }

        int pow = power(n/2);

        if(n%2 == 0){
            return (pow%1234567891) * (pow%1234567891);
        }else{
            return (pow%1234567891) * (pow%1234567891) * power(n%2)%1234567891;
        }
    }
}

>>>>>>> 26a5c94 (48)
*/
