package module10.task10_4;

public class A {
    public static void main(String[] args) {

        try {
            f();
        } catch (NullPointerException e) {
            throw new ClassCastException();
        }
    }

   private static void f() {
        g();
    }

   private static void g() {
        throw new NullPointerException();
    }
}
