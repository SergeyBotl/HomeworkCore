package Module5.Vers4;

import java.util.ArrayList;
import java.util.Date;


public class BookingComAPI implements API {
    DAO dao = new DAOImpl();

    BookingComAPI() {
        dao.save(new Room(1, 100, 3, new Date(), "Paradise", "Kiev"));
        dao.save(new Room(2, 150, 3, new Date(), "City Hotel", "Kiev"));
        dao.save(new Room(3, 300, 2, new Date(), "Grant Hotel", "Kiev"));
        dao.save(new Room(4, 600, 1, new Date(), "Bontiak Hotel", "Kiev"));
        dao.save(new Room(5, 100, 3, new Date(), "Paradise", "Kiev"));
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
