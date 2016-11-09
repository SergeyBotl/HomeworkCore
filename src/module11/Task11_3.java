package module11;

import java.io.IOException;
import java.util.Map;

import static module11.MyUtils.*;

public class Task11_3 {
    public static void main(String[] args) {
        String replace = "";
        String toReplace = "";
        MyUtils.link = "C:/Users/Sergey/Desktop/file1.txt";
        Map content = MyUtils.readFileMap();
        String oldContent=(MyUtils.convert(content));
        String stringContentReplace = MyUtils.replacer(content, replace, toReplace);
        String s = stringContentReplace + System.lineSeparator() + oldContent;

        try {

            MyUtils.write(s);

        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(stringContentReplace);


    }
}
