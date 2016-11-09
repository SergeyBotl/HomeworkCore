package Module5.Vers2;

import java.util.ArrayList;
import java.util.Date;

public class TripAdvisorAPI implements API {
    private Room[] rooms;

    public TripAdvisorAPI() {
        rooms = new Room[5];
        rooms[0] = new Room(12, 150, 3, new Date(), "City Hotel", "Kiev");
        rooms[1] = new Room(13, 300, 2, new Date(), "Grant Hotel", "Kiev");
        rooms[2] = new Room(14, 600, 1, new Date(), "Bontiak Hotel", "Kiev");
        rooms[3] = new Room(15, 100, 5, new Date(), "Paradise", "Kiev");
        rooms[4] = new Room(16, 250, 3, new Date(), "Hotel", "Kiev");
    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room roomFind = new Room(price, persons, hotel, city);
        ArrayList<Room> list = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(roomFind)) {
                list.add(room);
            }
        }
        ArrayList<Room> list1 = new ArrayList<>();
        for (Room room : list) {
            if (room.getHotelName().equals(roomFind.getHotelName())) {
                list1.add(room);
            }
        }
        return list1.toArray(new Room[list.size()]);
    }


    @Override
    public Room[] getAll() {
        return rooms;
    }
}
