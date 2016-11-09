package module10.task10_3;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> s = null;
        // s.add("a");

        try {
            s.add("b");
        } catch (NullPointerException e) {
            //System.out.println(e);
           throw e;
        }
    }
}
