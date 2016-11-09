package Module4.Task4_1;

import Module4.Task4_1.banks.Bank;

public class User {
    private String name, conpanyName;
    private double balanse;
    private int monthsOfEmployment, salary;
    private long id;
    private Bank bank;

    public User(String name, String conpanyName, double balanse, int monthsOfEmployment, int salary, long id, Bank bank) {
        this.name = name;
        this.conpanyName = conpanyName;
        this.balanse = balanse;
        this.monthsOfEmployment = monthsOfEmployment;
        this.salary = salary;
        this.id = id;
        this.bank = bank;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalanse() {
        return balanse;
    }

    public void setBalanse(double balanse) {
        this.balanse = balanse;
    }

    public int getMonthsOfEmployment() {
        return monthsOfEmployment;
    }

    public void setMonthsOfEmployment(int monthsOfEmployment) {
        this.monthsOfEmployment = monthsOfEmployment;
    }

    public String getConpanyName() {
        return conpanyName;
    }

    public void setConpanyName(String conpanyName) {
        this.conpanyName = conpanyName;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public Bank getBank() {
        return bank;
    }

    public void setBank(Bank bank) {
        this.bank = bank;
    }


    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                //  ", conpanyName='" + conpanyName + '\'' +
                ", balanse=" + balanse +
                // ", monthsOfEmployment=" + monthsOfEmployment +
                ", salary=" + salary +
                //", id=" + id +
                ", bank=" + bank +
                '}';
    }
}
