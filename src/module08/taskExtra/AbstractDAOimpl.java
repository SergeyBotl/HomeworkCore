package module08.taskExtra;


import java.util.ArrayList;
import java.util.List;

public class AbstractDAOimpl implements AbstractDAO<User> {

    List<User> out=new ArrayList<>();

   /* public List<User> getOut() {
        return out;
    }*/

    @Override
    public void save(User user) {

    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public User getById(long id) {
        return null;
    }


}
