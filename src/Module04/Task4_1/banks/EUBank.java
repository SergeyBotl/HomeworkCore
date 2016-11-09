package Module4.Task4_1.banks;

import static Module4.Task4_1.Currency.EUR;
import static Module4.Task4_1.Currency.USD;

public class EUBank extends Bank {
    private int UP_TO = 1000;

    @Override
    public int getLimitOfWithdrawal() {
        return (getCurrency() == USD) ? 2000 :
                (getCurrency() == EUR) ? 2200 : 0;
    }

    @Override
    public int getLimitOfFunding() {
        return (getCurrency() == USD) ? 0 ://0
                (getCurrency() == EUR) ? 20000 : 0;

    }

    @Override
    public int getMonthlyRate() {
        switch (getCurrency()) {
            case USD:
                return 0;
            case EUR:
                return 1;
            default:
                return 0;
        }
    }

    @Override
    public double getCommission(int amoumt) {
        switch (getCurrency()) {
            case USD:
                return amoumt < UP_TO ? 5 : 7;
            case EUR:
                return amoumt < UP_TO ? 2 : 4;
            default:
                return 0;
        }
    }
}
