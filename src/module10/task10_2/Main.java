package module10.task10_2;

public class Main {

    public static void main(String[] args) {

        try {
            test(-1);
        } catch (MyException e) {
            System.out.println(e);
            //throw e;
        }
    }

    private static void test(int a) {
        if (a < 0) throw new MyException("Число не может быть меньше 0!");
        System.out.println("Result is : " + a);
    }
}
