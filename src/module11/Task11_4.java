package module11;

import java.io.*;

import java.util.Map;
import java.util.StringTokenizer;

public class Task11_4 {
    private static File file = new File("src/module11/file.txt");

    public static void main(String[] args) {
        String word = "in";
        System.out.println(checkWord(word));
    }

    private static int checkWord(String word) {
        String line = MyUtils.fileToString(file);
        StringTokenizer st = new StringTokenizer(line);
        int i = 0;
        while (st.hasMoreTokens()) {
            if (st.nextToken().equals(word))
                i++;
        }
        return i;
    }
}
