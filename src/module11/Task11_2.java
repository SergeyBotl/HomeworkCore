package module11;

import java.io.IOException;
import java.util.Map;

public class Task11_2 {
    public static void main(String[] args) {
        String replace = "333";
        String toReplace = "---";
        MyUtils.link = "C:/Users/Sergey/Desktop/file.txt";
        Map content = MyUtils.readFileMap();
        String stringContentReplace = MyUtils.replacer(content, replace, toReplace);

        try {
            MyUtils.write(stringContentReplace);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(stringContentReplace);

    }
}
