package Module8.Task8_1;

import java.util.List;
import java.util.Stack;

public interface AbstractDAO<T> {


     T save(T t);

    void delete(T t);

    void deleteAll(List<T> tList);

    void saveAll(List<T> tList);

    List <T> getList();
}
