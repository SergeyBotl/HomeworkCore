package Module5.Vers2;

import java.util.ArrayList;
import java.util.List;

public class DAOHardImpl implements DAO {
    private List<Room> roomsFound = new ArrayList<>();

    @Override
    public boolean save(Room room) {
        room.setActive(true);
        return roomsFound.add(room);
    }

    @Override
    public boolean delete(int id) {
        Room room = findById(id);
        room.setActive(false);
        return !room.isActive();
    }

    public Room update(Room room, int index) {
        roomsFound.set(index, room);
        return roomsFound.get(index);
    }

    @Override
    public Room findById(long id) {
        for (Room room : roomsFound) {
            if (room.getId() == id) return room;
        }
        return null;
    }

    @Override
    public Room[] getAll() {
        ArrayList<Room> list = new ArrayList<>();
        for (Room room : roomsFound) {
            if (room.isActive())
                list.add(room);
        }
        return list.toArray(new Room[list.size()]);
    }
}
