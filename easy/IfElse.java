package easy;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");
        String msg = "Weird";

        if(N%2==0){
            if((N>=2 && N<=5) || N > 20 ){
                msg = "Not Weird";
            }
        }

        System.out.println(msg);

        scanner.close();
    }
}


