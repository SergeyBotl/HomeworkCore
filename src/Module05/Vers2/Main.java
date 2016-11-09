package Module5.Vers2;

public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        controller.requestRooms(100, 3, "Kiev", "Paradise");
        controller.requestRooms(600, 1, "Kiev", "Bontiak Hotel");
        controller.requestRooms(250, 3, "Kiev", "Hotel");
        controller.printAll();
        controller.update(10, 610);
        controller.update(5, 140);
        controller.printAll();
        controller.roomDel(14);
        controller.printAll();

        controller.check();
        controller.printAll();

    }
}

