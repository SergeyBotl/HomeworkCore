package Module2;


public class Task2 {
    public static void main(String[] args) {
        double balance = 100;
        double balance1 = 100;
        double withdrawal = 10;
        double withdrawal1 = 99;
        double comis = 0.05;

        withdrawBalanse(balance, withdrawal, comis);
        withdrawBalanse(balance1, withdrawal1, comis);

    }

    static void withdrawBalanse(double balanse, double withdrawal, double comis) {

        double comise = withdrawal * comis;
        double sumWithdraw = withdrawal + comise;

        if (balanse - sumWithdraw > 0) {
            balanse -= sumWithdraw;
            System.out.println("ok " + comise + " " + balanse);

        } else {
            System.out.println("no ");

        }


    }

}
