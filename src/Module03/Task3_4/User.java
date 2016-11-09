package Module3.Task3_4;

class User {
    private String name, companyName, currency;
    private int balance, monthesOfEmployment, salary, addMonth;

    User(String name, int balance, int monthesOfEmployment, String companyName, int salary, String currency) {
        this.name = name;
        this.balance = balance;
        this.monthesOfEmployment = monthesOfEmployment;
        this.companyName = companyName;
        this.salary = salary;
        this.currency = currency;
    }

    int paySalary() {
        return balance += salary;
    }

    double withdraw(int summ) {
        if (summ < 1000) {
            return balance -= summ * 1.05;
        } else {
            return balance -= summ * 1.1;
        }
    }

    int monthIncreaser(int addMonth) {
        return monthesOfEmployment + addMonth;
    }

    String getName() {
        return name;
    }

    void setName(String name) {
        this.name = name;
    }

    int getBalance() {
        return balance;
    }

    void setBalance(int balance) {
        this.balance = balance;
    }

    int getMonthesOfEmployment() {
        return monthesOfEmployment;
    }

    void setMonthesOfEmployment(int monthesOfEmployment) {
        this.monthesOfEmployment = monthesOfEmployment;
    }

    String getCompanyName() {

        return companyName;
    }

    void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    int getSalary() {
        return salary;
    }

    void setSalary(int salary) {
        this.salary = salary;
    }

    String getCurrency() {
        return currency;
    }

    void setCurrency(String currency) {
        this.currency = currency;
    }

    int getAddMonth() {
        return addMonth;
    }

    void setAddMonth(int addMonth) {
        this.addMonth = addMonth;
    }
}