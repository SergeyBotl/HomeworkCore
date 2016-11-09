package Module5.Vers2;

import java.util.ArrayList;
import java.util.Date;

public class BookingComAPI implements API {
    private Room[] rooms;

    public BookingComAPI() {
        rooms = new Room[6];
        rooms[0] = new Room(1, 100, 3, new Date(), "Paradise", "Kiev");
        rooms[1] = new Room(2, 150, 3, new Date(), "City Hotel", "Kiev");
        rooms[2] = new Room(3, 300, 2, new Date(), "Grant Hotel", "Kiev");
        rooms[3] = new Room(4, 600, 1, new Date(), "Bontiak Hotel", "Kiev");
        rooms[4] = new Room(5, 100, 3, new Date(), "Paradise", "Kiev");
        rooms[5] = new Room(6, 100, 4, new Date(), "Bontiak Hotel", "Kiev");

    }

    @Override
    public Room[] findRooms(int price, int persons, String hotel, String city) {
        Room roomFind = new Room(price, persons, city, hotel);
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
