package Module4.Task4_1.banks;

import Module4.Task4_1.Currency;

public abstract class Bank {
    private long id;
    private String bankCountry;
    private Currency currency;
    private int numberOfEmployees;
    private double avrSalaryOfEmployee;
    private long rating;
    private long totalCapital;

    public abstract int getLimitOfWithdrawal();

    public abstract int getLimitOfFunding();

    public abstract int getMonthlyRate();

    public abstract double getCommission(int amoumt);

    public double moneyPaidMonthlyForSalary() {
        return 0;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getBankCountry() {
        return bankCountry;
    }

    public void setBankCountry(String bankCountry) {
        this.bankCountry = bankCountry;
    }

    public Currency getCurrency() {
        return currency;
    }

    public void setCurrency(Currency currency) {
        this.currency = currency;
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    public void setNumberOfEmployees(int numberOfEmployees) {
        this.numberOfEmployees = numberOfEmployees;
    }

    public double getAvrSalaryOfEmployee() {
        return avrSalaryOfEmployee;
    }

    public void setAvrSalaryOfEmployee(double avrSalaryOfEmployee) {
        this.avrSalaryOfEmployee = avrSalaryOfEmployee;
    }

    public long getRating() {
        return rating;
    }

    public void setRating(long rating) {
        this.rating = rating;
    }

    public long getTotalCapital() {
        return totalCapital;
    }

    public void setTotalCapital(long totalCapital) {
        this.totalCapital = totalCapital;
    }

    @Override
    public String toString() {
        return "Bank{" +
                //"id=" + id +
                //", bankCountry='" + bankCountry + '\'' +
                ", currency=" + currency +
                //", numberOfEmployees=" + numberOfEmployees +
                //", avrSalaryOfEmployee=" + avrSalaryOfEmployee +
                //", rating=" + rating +
                //", totalCapital=" + totalCapital +
                '}';
    }
}
