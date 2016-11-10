package module08.taskExtra;

public class Main {
    public static void main(String[] args) {

        UserDAO dao = new UserDAO();

        dao.save(new User(1, "Ann"));
        dao.save(new User(2, "Jon"));
        dao.save(new User(3, "Den"));
        dao.save(new User(4, "jhj"));

        dao.getById(4);

        dao.deleteById(4);


        
        dao.getAll();

    }

}
