package Module4.Task4_1;

import Module4.Task4_1.banks.Bank;
import Module4.Task4_1.banks.ChinaBank;
import Module4.Task4_1.banks.EUBank;
import Module4.Task4_1.banks.USBank;

public class Main {

    public static void main(String[] args) {
        Bank usBank = new USBank();
        usBank.setCurrency(Currency.USD);

        Bank euBank = new EUBank();
        euBank.setCurrency(Currency.EUR);

        Bank chinaBank = new ChinaBank();
        chinaBank.setCurrency(Currency.USD);

        User ann = new User("Ann", "Ann inc.", 5000, 5, 1200, 45, usBank);
        User jon = new User("Jon", "Jon inc.", 5000, 2, 900, 46, euBank);
        User lee = new User("Lee", "Lee inc.", 5000, 10, 100, 47, chinaBank);

        BankSystem bankSystem = new BankSystemImpl();

        bankSystem.withdrawOfUser(ann, 900);
        bankSystem.withdrawOfUser(jon, 1200);
        bankSystem.withdrawOfUser(lee, 50);

        bankSystem.fundUser(ann, 1500);
        bankSystem.fundUser(jon, 900);
        bankSystem.fundUser(lee, 100);


        bankSystem.transferMoney(ann, jon, 100);
        bankSystem.transferMoney(jon, lee, 100);
        bankSystem.transferMoney(lee, ann, 100);

        System.out.println(lee);

        bankSystem.paySalary(ann);
        bankSystem.paySalary(jon);
        bankSystem.paySalary(lee);

        System.out.println(lee);
    }
}
