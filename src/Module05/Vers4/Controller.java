package Module5.Vers4;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Controller {

    private API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        List<Room> list = new ArrayList<>();
        for (API api : apis) {
            Room[] res = api.findRooms(price, persons, city, hotel);
            if (res != null) {
                for (Room room : res) {
                    if (room != null) ;// save(room);
                    list.add(room);
                }
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    Room[] check(API api1, API api2) {
        Room[] roomsApi1 = api1.getRooms();
        Room[] roomsApi2 = api2.getRooms();
        Set<Room> set = new HashSet<>();
        for (Room room : roomsApi1) {
            for (Room room1 : roomsApi2) {
                if (room.equals(room1)) {
                    set.add(room);
                }
            }
        }
        return set.toArray(new Room[set.size()]);
    }

}
