package Module4.Task4_1;

import Module4.Task4_1.banks.Bank;

public class BankSystemImpl implements BankSystem {

    @Override
    public void withdrawOfUser(User user, int amount) {
        Bank userBank = user.getBank();
        double commission = userBank.getCommission(amount) / 100 + 1;
        if (userBank.getLimitOfWithdrawal() > amount * commission) {
            double newBalans = user.getBalanse() - amount * commission;
            user.setBalanse(newBalans);
        }
    }

    @Override
    public void fundUser(User user, int amount) {
        Bank userBank = user.getBank();
        int fundLimit = userBank.getLimitOfFunding();
        if (fundLimit > amount || fundLimit == 0) {
            double newBalance = user.getBalanse() + amount;
            user.setBalanse(newBalance);
        }
    }

    @Override
    public void transferMoney(User fromUser, User toUser, int amount) {
        Bank toUserBank = toUser.getBank();
        Bank fromUserBank = fromUser.getBank();
        double commiss = fromUserBank.getCommission(amount) / 100 + 1;
        int fund = toUserBank.getLimitOfFunding();
        if (fromUserBank.getLimitOfWithdrawal() > amount * commiss) {
            if (fund > amount || fund == 0)
                fromUser.setBalanse(fromUser.getBalanse() - amount * commiss);
            toUser.setBalanse(toUser.getBalanse() + amount);
        }
    }

    @Override
    public void paySalary(User user) {
        Bank userBank = user.getBank();
        double commiss = userBank.getCommission(user.getSalary()) / 100 + 1;
        user.setBalanse(user.getBalanse() + (user.getSalary() - commiss));
    }
}

