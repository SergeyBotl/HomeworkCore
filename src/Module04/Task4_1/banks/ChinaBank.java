package Module4.Task4_1.banks;

import static Module4.Task4_1.Currency.EUR;
import static Module4.Task4_1.Currency.USD;

public class ChinaBank extends Bank {
    int UP_TO = 1000;

    @Override
    public int getLimitOfWithdrawal() {
        return (getCurrency() == USD) ? 100 :
                (getCurrency() == EUR) ? 150 : 0;
    }

    @Override
    public int getLimitOfFunding() {
        return getCurrency() == USD ? 5000 :
                getCurrency() == EUR ? 10000 : 0;
    }


    @Override
    public int getMonthlyRate() {
        return (getCurrency() == USD) ? 1 : 0;
    }

    @Override
    public double getCommission(int amoumt) {
        switch (getCurrency()) {
            case USD:
                return (amoumt < UP_TO) ? 3 : 5;
            case EUR:
                return (amoumt < UP_TO) ? 10 : 11;
            default:
                return 0;
        }
    }
}
