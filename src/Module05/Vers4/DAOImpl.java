package Module5.Vers4;

import java.util.ArrayList;
import java.util.List;

public class DAOImpl implements DAO {

    private List<Room> list = new ArrayList<>();

    @Override
    public boolean save(Room room) {
        return list.add(room);
    }

    @Override
    public boolean delete(int index) {
        list.remove(index);
        return true;
    }

    @Override
    public Room update(Room room, int index) {
        return list.set(index, room);
    }

    @Override
    public Room findById(long id) {
        for (Room room : list) {
            if (room.getId() == id) return room;
        }
        return null;
    }


    @Override
    public Room[] getAll() {
        return list.toArray(new Room[list.size()]);
    }
}
