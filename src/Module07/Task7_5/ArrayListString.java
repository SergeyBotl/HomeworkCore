package Module7.Task7_5;

import java.util.*;

public class ArrayListString implements SpeedTest {
    List<Result> results = new ArrayList<>();
    List<String> list = new ArrayList<>();
    private int count;

    @Override
    public void check(int count) {
        this.count = count;
        add();
    }

    String generator() {
        char[] chars = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        StringBuilder sb = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            char c = chars[random.nextInt(chars.length)];
            sb.append(c);
        }
        return sb.toString();

    }

    @Override
    public void add() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println(list.add(generator()));
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("List add: ", p));
        set();
    }

    @Override
    public void set() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println(list.set(i, generator()));
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("List set: ", p));
        get();
    }

    @Override
    public void get() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println(list.get(i));

        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("List get: ", p));
        remove();
    }

    @Override
    public void remove() {
        Queue<String> queue = new PriorityQueue<>();
        queue.addAll(list);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println(queue.poll());
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("Queue remove: ", p));

    }
}
