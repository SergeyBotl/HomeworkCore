package module11;

import java.io.IOException;
import java.util.Map;

public class Task11_4 {
    public static void main(String[] args) {
        String checkWord = "to";
        MyUtils.link = "C:/Users/Sergey/Desktop/file1.txt";
        String string="Count words " + "'" + checkWord + "':";
        String content = MyUtils.readFileString();



        System.out.println(content);

        System.out.println(string+ MyUtils.check(content, checkWord));

    }

}
