package Module2;


public class Task4 {
    static int[] balances = {1200, 250, 2000, 500, 3200};
    static String[] ownerNames = {"Jane", "Ann", "Jack", "Oww", "Lane"};

    static void fundBalance(String ownerName, double fund) {

        for (int i = 0; i < balances.length; i++) {
            if (ownerNames[i].equals(ownerName)) {
                balances[i] += fund;
                System.out.println(ownerName + " " + balances[i]);

                break;
            }
        }
    }

    public static void main(String[] args) {


        String ownerName = "Oww";
        double fund = 100;

        fundBalance(ownerName, fund);
    }
}
