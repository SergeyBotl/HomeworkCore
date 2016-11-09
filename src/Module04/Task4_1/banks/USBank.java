package Module4.Task4_1.banks;

import static Module4.Task4_1.Currency.EUR;
import static Module4.Task4_1.Currency.USD;

public class USBank extends Bank {
    private int UP_TO = 1000, USD_LIMIT = 1000, EUR_LIMIT = 1200;

    @Override
    public int getLimitOfWithdrawal() {
        return (getCurrency() == USD) ? USD_LIMIT :
                ((getCurrency() == EUR) ? EUR_LIMIT : 0);
    }

    @Override
    public int getLimitOfFunding() {
        return (getCurrency() == USD) ? 0 ://0
                (getCurrency() == EUR) ? 10000 : 0;

    }

    @Override
    public int getMonthlyRate() {
        return (getCurrency() == USD) ? 1 :
                (getCurrency() == EUR ? 2 : 0);
    }

    @Override
    public double getCommission(int amoumt) {
        switch (getCurrency()) {
            case USD:
                return amoumt < UP_TO ? 5 : 7;
            case EUR:
                return amoumt < UP_TO ? 6 : 8;
            default:
                return 0;
        }
    }
}
