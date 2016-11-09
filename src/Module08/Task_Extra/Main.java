package Module8.Task_Extra;

public class Main {
    public static void main(String[] args) {

        AbstractDAOimpl<UserDAO> daOimpl = new AbstractDAOimpl();

        daOimpl.save(new UserDAO(1, "Ann"));
        daOimpl.save(new UserDAO(2, "Jon"));
        daOimpl.save(new UserDAO(3, "Den"));

        System.out.println(daOimpl.getById(1));

    }

}
