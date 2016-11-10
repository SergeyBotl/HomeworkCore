package module08.taskExtra;

import java.util.Iterator;
import java.util.List;

public class UserDAO extends AbstractDAOimpl {

    public void save(User user) {
        out.add(user);
    }

    public void deleteById(long id) {
        Iterator<User> it = out.iterator();
        while (it.hasNext()) {
            if (it.next().getId() == id) {
                it.remove();
            }
        }
        System.out.println("\nDelete by Id");
        out.forEach(System.out::println);
    }

    public User getById(long id) {
        System.out.println("\nGet by Id");
        //noinspection OptionalGetWithoutIsPresent
        User user = out.stream().filter(u -> u.getId() == id).findFirst().get();
        System.out.println(user);
        return user;
    }



    List<User> getAll() {
        System.out.println("\nGet all");
        out.forEach(System.out::println);
        return out;
    }
}
