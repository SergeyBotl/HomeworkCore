package Module6;

import java.util.ArrayList;

public class UserUtils {

    static User[] uniqueUsers(User[] users) {
        for (int i = 0; i < users.length; i++) {
            for (int b = i + 1; b < users.length - i; b++) {
                if (users[i].equals(users[b])) {
                    users[b] = null;
                }
            }
        }
        return users;
    }

    static User[] usersWithContitionalBalance(User[] users, int balance) {
        ArrayList<User> list = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                if (user.getBalance() == balance) {
                    list.add(user);
                }
            }
        }
        User users1[] = new User[list.size()];
        list.toArray(users1);
        return users1;
    }

    final static User[] paySalaryToUsers(User[] users) {
        for (User user : users) {
            if (user != null)
                user.setBalance(user.getBalance() + user.getSalary());
        }
        return users;
    }

    static final long[] getUsersId(User[] users) {
        long[] longs = new long[users.length];
        for (int i = 0; i < users.length; i++) {
            if (users[i] != null) {
                longs[i] = users[i].getId();
            }
        }
        return longs;
    }

    static User[] deleteEmptyUsers(User[] users) {
        ArrayList<User> list = new ArrayList<>();
        for (User user : users) {
            if (user != null) {
                list.add(user);
            }
        }
        User user1[] = new User[list.size()];
        list.toArray(user1);
        return user1;
    }
}
