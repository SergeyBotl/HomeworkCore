package module09;

import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        String ss="rr";


        List<String> mList = Arrays.asList("aa1","cc2", "cc1", "aa2", "bb1");

        mList
                .stream()
                .filter(s -> s.startsWith("a"))
                //.map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);


       /* Stream.of("dd2", "aa2", "bb1", "bb3", "cc4")
                .map(s -> {
                    System.out.println("map: " + s);
                    return s.toUpperCase();
                })
                .anyMatch(s -> {
                    System.out.println("anyMatch: " + s);
                    return s.startsWith("A");
                });*/
    }


}
