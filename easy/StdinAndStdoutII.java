package easy;

import java.util.Locale;
import java.util.Scanner;

public class StdinAndStdoutII {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in).useLocale(Locale.US).useDelimiter("\\n");
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        // Write your code here.

        System.out.println("String: " + s);
        System.out.println("Double: " + d);
        System.out.println("Int: " + i);
    }
}
