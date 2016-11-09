package Module8.Task_Extra;

import java.util.*;

public class AbstractDAOimpl<T> implements AbstractDAO<T> {

    List<T> out = new ArrayList<>();


    @Override
    public T save(T t) {
        out.add(t);
        return null;
    }

    @Override
    public List<T> getList() {
        return out;
    }

    public void deleteById(long id) {

    }

    public T getById(long id) {

        return null;
    }

}
