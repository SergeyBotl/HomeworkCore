package Module5.Vers4;

public interface DAO {
    boolean save(Room room);

    boolean delete(int index);

    Room update(Room room, int index);

    Room findById(long id);

    Room[] getAll();
}
