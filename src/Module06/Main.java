package Module6;

public class Main {
    public static void main(String[] args) {
        User users[] = new User[6];
        users[0] = new User(1, "Jon", "Livingston", 1200, 200);
        users[1] = new User(2, "Ann", "Becker", 900, 0);
        users[2] = new User(3, "Beal", "Clinton", 880, 300);
        users[3] = new User(4, "Den", "Miller", 700, 100);
        users[4] = new User(5, "Lara", "Croft", 1000, 500);
        users[5] = new User(1, "Jon", "Livingston", 1200, 200);

        User[] usersResult = UserUtils.uniqueUsers(users);
        User[] usersResult1 = UserUtils.usersWithContitionalBalance(users, 200);
        User[] usersResult4 = UserUtils.deleteEmptyUsers(users);
        User[] usersResult2 = UserUtils.paySalaryToUsers(users);
        long[] usersResult3 = UserUtils.getUsersId(users);

    }
}