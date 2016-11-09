package Module2;

/**
 * Created by Strgey on 23.08.2016.
 */
public class Task3 {
    public static void main(String[] args) {
        int[] balances = {1200, 250, 2000, 500, 3200};
        String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

        double comis = 1.05;
        String ownerName = "Ann";
        double withdrawal = 100;

        String ownerName1 = "Oww";
        double withdrawal1 = 490;

        bank(ownerNames, ownerName, balances, withdrawal, comis);
        bank(ownerNames, ownerName1, balances, withdrawal1, comis);

    }

    static void bank(String ownerNames[], String ownerName, int balances[], double withdrawal, double comis) {
        for (int i = 0; i < ownerNames.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                if (balances[i] - withdrawal * comis > 0) {
                    balances[i] -= (withdrawal * comis);
                    System.out.println(ownerNames[i] + " " + withdrawal + " " + balances[i]);
                } else {
                    System.out.println(ownerNames[i] + "NO");
                }
                break;
            }
        }
    }


}

