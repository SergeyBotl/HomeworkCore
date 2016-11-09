package Module5.Vers4;

import java.util.ArrayList;
import java.util.Date;

public class GoogleAPI implements API {
    DAO dao = new DAOImpl();

    public GoogleAPI() {

        dao.save(new Room(6, 100, 4, new Date(), "Bontiak Hotel", "Kiev"));
        dao.save(new Room(7, 100, 5, new Date(), "Paradise", "Kiev"));
        dao.save(new Room(8, 150, 3, new Date(), "City Hotel", "Kiev"));
        dao.save(new Room(9, 300, 2, new Date(), "Grant Hotel", "Kiev"));
        dao.save(new Room(10, 600, 1, new Date(), "Bontiak Hotel", "Kiev"));

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
