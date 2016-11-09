package module10.task10_5;

public class Main {

    public static void test(int number) throws FirstException, SecondException, LastException {

        switch (number) {
            case 1:
                throw new FirstException("first");
            case 2:
                throw new SecondException("second");
            case 3:
                throw new LastException("last");
        }

    }

    public static void main(String[] args){

        try {
            test(3);
        } catch (FirstException | SecondException | LastException e) {
            System.out.println(e);
        }

    }
}