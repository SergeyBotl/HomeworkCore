package module08.taskExtra;

import java.util.Iterator;
import java.util.List;

public class UserDAO extends AbstractDAOimpl {

    public void saveUser(User user) {
        save(user);
    }

    public void deleteById(long id) {
        Iterator<User> it = getOut().iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
            }
        }
        System.out.println("\nDelete by Id");
        getOut().forEach(System.out::println);
    }

    public User getById(long id) {
        System.out.println("\nGet by Id");
        //noinspection OptionalGetWithoutIsPresent
        User user = getOut().stream().filter(u -> u.getId() == id).findFirst().get();
        System.out.println(user);
        return user;
    }



    List<User> getAll() {
        System.out.println("\nGet all");
        getOut().forEach(System.out::println);
        return getOut();
    }
}
