package module11;

import java.io.IOException;
import java.util.Map;

public class Task11_1 {
    public static void main(String[] args) {
        String replace = "333";
        String toReplace = "---";
        MyUtils.link = "C:/Users/Sergey/Desktop/file.txt";
        Map file = MyUtils.readFileMap();
        String stringFile = MyUtils.replacer(file, replace, toReplace);

        System.out.println(stringFile);

    }
}
