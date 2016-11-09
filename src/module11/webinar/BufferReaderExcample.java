package module11.webinar;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferReaderExcample {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        int i = 3;
        while (i > 0) {
            String reader = null;
            try {

                reader = bufferedReader.readLine();
               // reader.split(" ");
            } catch (IOException e) {
                System.err.println("err");
            }
            System.out.println(reader);
            i--;
        }


    }
}
