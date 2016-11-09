package Module5.Vers4;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {
    DAO dao = new DAOImpl();

    TripAdvisorAPI() {
        dao.save(new Room(11, 100, 5, new Date(), "Paradise", "Kiev"));
        dao.save(new Room(12, 150, 3, new Date(), "City Hotel", "Kiev"));
        dao.save(new Room(13, 300, 2, new Date(), "Grant Hotel", "Kiev"));
        dao.save(new Room(14, 600, 1, new Date(), "Bontiak Hotel", "Kiev"));
        dao.save(new Room(15, 100, 5, new Date(), "Paradise", "Kiev"));
        dao.save(new Room(16, 250, 3, new Date(), "Hotel", "Kiev"));
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room roomFind = new Room(price, persons, city, hotel);
        ArrayList<Room> list = new ArrayList<>();
        for (Room room : getRooms()) {
            if (room.equals(roomFind)) {
                list.add(room);
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    @Override
    public Room[] getRooms() {
        return dao.getAll();
    }
}
