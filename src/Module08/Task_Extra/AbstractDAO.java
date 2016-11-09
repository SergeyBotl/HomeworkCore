package Module8.Task_Extra;

import java.util.ArrayList;
import java.util.List;

public interface AbstractDAO<T> {

    List <T> getList();

    T save(T t);

    void deleteById(long id);

    T getById(long id);
}
