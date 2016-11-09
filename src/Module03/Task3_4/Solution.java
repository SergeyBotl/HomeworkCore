package Module3.Task3_4;


class Solution {

    private static User user = new User("Ben", 1150, 1, "GoIt inc.", 1500, "USD");

    static void main(String[] args) {
        user.paySalary();
        user.withdraw(1005);
        nameCompany();
        user.monthIncreaser(1);
        companyNameLenfht();

    }

    private static void nameCompany() {
        user.getCompanyName();
    }

    private static void companyNameLenfht() {
        user.getCompanyName().length();
    }

}
