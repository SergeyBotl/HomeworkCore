package module10.task10_1;

public class Main {
    public static void main(String[] args) {

        try {
            int a= Integer.parseInt(null);

        }catch (Exception e){
            System.out.println("catch");
        }finally {
            System.out.println("finally");
        }

    }
}
