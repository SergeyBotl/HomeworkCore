package module08.taskExtra;


public interface AbstractDAO<T> {

    void save(T t);

    void deleteById(long id);

    T getById(long id);
}
