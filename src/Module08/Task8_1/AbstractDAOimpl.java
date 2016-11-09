package Module8.Task8_1;

import java.util.List;
import java.util.Stack;

public class AbstractDAOimpl<T> implements AbstractDAO<T> {

    Stack<T> stk = new Stack<>();

    @Override
    public T save(T t) {
        stk.push(t);
        return null;
    }

    @Override
    public void delete(T t) {
        stk.remove(t);
    }

    @Override
    public void deleteAll(List<T> tList) {
        stk.removeAll(tList);
    }

    @Override
    public void saveAll(List<T> tList) {
        stk.addAll(tList);
    }

    @Override
    public List<T> getList() {
        return stk;
    }


}
