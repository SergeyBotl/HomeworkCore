package Module7.Task7_5;

import java.util.*;

public class ArrayListInteger implements SpeedTest {
    Random random = new Random();
    List<Result> results = new ArrayList<>();
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
            System.out.println(list.get(i));
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("List get: ", p));
        remove();
    }

    @Override
    public void remove() {
        Queue<Integer> queue = new PriorityQueue<>();
        queue.addAll(list);
        long start = System.currentTimeMillis();
        for (int i = 0; i < count; i++) {
            System.out.println(queue.remove());
        }
        long finish = System.currentTimeMillis();
        long p = finish - start;
        results.add(new Result("Queue remove: ", p));

    }


}
