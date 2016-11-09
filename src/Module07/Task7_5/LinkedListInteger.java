package Module7.Task7_5;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

public class LinkedListInteger implements SpeedTest {
    Random random = new Random();
    List<Result> results = new LinkedList<>();
    List<Integer> list = new ArrayList<>();
    private int count;

    @Override
    public void check(int count) {
        this.count = count;
        add();
    }

    @Override
    public void add() {
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            int p = random.nextInt(count);

            System.out.println(list.add(p));
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
            int p = random.nextInt(count);
            list.set(i, p);
            System.out.println(p);
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
            int p = random.nextInt(count);
            System.out.println(list.get(p));
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("List get: ", p));
        remove();
    }

    @Override
    public void remove() {

        long start = System.currentTimeMillis();
        for (int i = 0; i < 500; i++) {
            System.out.println(list.remove(i));
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("List 500 remove: ", p));

    }


}
