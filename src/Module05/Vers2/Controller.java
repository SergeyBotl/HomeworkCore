package Module5.Vers2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Controller {
    private int identif = 0;
    private String[] info = {" ", "Request Rooms", " After del ", "Saved", "getAll[]", " Update", " Check"};
    private Room[] rooms;
    private API[] apis = {new BookingComAPI(), new GoogleAPI(), new TripAdvisorAPI()};
    private DAOHardImpl daoHard = new DAOHardImpl();
    private ArrayList<Room> list = new ArrayList<>();

    Room[] requestRooms(int price, int persons, String city, String hotel) {
        identif = 1;
        for (API api : apis) {
            Room[] res = api.findRooms(price, persons, city, hotel);
            if (res != null) {
                for (Room room : res) {
                    if (room != null) daoHard.save(room);
                }
            }
        }
        return daoHard.getAll();
    }

    boolean roomDel(int id) {
        identif = 2;
        return daoHard.delete(id);
    }

    Room[] printAll() {
        System.out.println("   Print all " + info[identif]);
        if (identif != 6) {
            rooms = daoHard.getAll();
        } else {
            rooms = new Room[list.size()];
            Collections.sort(list, new Controller.CompBal());
            list.toArray(rooms);
        }
        for (Room room : rooms) {
            if (room.isActive())
                System.out.println(room.isActive() + " " + room);
        }
        identif = 0;
        return rooms;
    }

    Room[] check() {
        int count;
        identif = 6;
        for (API api : apis) {
            Room[] roomAll = api.getAll();
            for (Room room : roomAll) {
                room.setActive(false);
                list.add(room);
            }
        }
        for (int i = 0; i < list.size(); i++) {
            count = 0;
            for (int p = i + 1; p < list.size(); p++) {

                if (!list.get(i).isActive()) {
                    if (list.get(i).equals(list.get(p))) {
                        if (!list.get(p).isActive()) {
                            if (count == 0) list.get(i).setActive(true);
                            count++;
                            list.get(p).setActive(true);
                        }
                    }
                }
            }
        }
        return list.toArray(new Room[list.size()]);
    }

    boolean update(long id, int price) {
        identif = 5;
        Room[] allRoom = daoHard.getAll();
        for (int i = 0; i < allRoom.length; i++) {
            if (allRoom[i].getId() == id) allRoom[i].setPrice(price);
            daoHard.update(allRoom[i], i);
        }
        return false;
    }

    public static class CompBal implements Comparator<Room> {

        @Override
        public int compare(Room o1, Room o2) {
            return o1.getPrice() - o2.getPrice();
        }
    }
}
