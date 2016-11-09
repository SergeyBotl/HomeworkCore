package Module5.Vers2;

public interface DAO {
    boolean save(Room room);

    boolean delete(int id);

    //Room update(Room room,int index);
    Room update(Room room, int index);

    Room findById(long id);

    Room[] getAll();
}
