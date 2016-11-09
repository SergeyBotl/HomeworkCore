package module11.webinar;

import java.io.InputStream;
import java.util.Scanner;

public class ScanerExcample {
    public static void main(String[] args) {
        InputStream inputStream = System.in;
        Scanner scanner = new Scanner(inputStream);
        int i = 2;
        while (i > 0 && scanner.hasNext()) {
            String s=scanner.next();
            int result=0;
            try {
                result = Integer.valueOf(s);
            }catch (NumberFormatException e){
                System.err.println("WRONG INPUT");
            }
            System.out.println(result);
            i--;
        }

        scanner.close();
    }
}
