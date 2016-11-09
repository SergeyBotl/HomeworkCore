package Module7.Task7_5;

public class Main {


    public static void main(String[] args) {
        int COUNT = 10000;

        ArrayListInteger arrayListInteger = new ArrayListInteger();
        arrayListInteger.check(COUNT);

        ArrayListString arrayListString = new ArrayListString();
        arrayListString.check(COUNT);

        LinkedListInteger linkedListInteger = new LinkedListInteger();
        linkedListInteger.check(COUNT);

        LinkedListString linkedListString = new LinkedListString();
        linkedListString.check(COUNT);

        System.out.println();
        System.out.println("  ArrayList Integer");
        arrayListInteger.results.forEach(System.out::println);

        System.out.println("  ArrayList String");
        arrayListString.results.forEach(System.out::println);

        System.out.println("  Linkedlist Integer");
        linkedListInteger.results.forEach(System.out::println);

        System.out.println("  Linkedlist String");
        linkedListString.results.forEach(System.out::println);
    }
}
