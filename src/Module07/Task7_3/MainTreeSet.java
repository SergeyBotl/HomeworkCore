package Module7.Task7_3;

import Module7.Currency;

public class MainTreeSet {
    public static void main(String[] args) {
        TreeSetController treeSetController = new TreeSetController();

        // treeSetController.printAll();
        //treeSetController.findaLastName("Philips");
        treeSetController.mostLargestPrice();
        treeSetController.deleteForCurency(Currency.UAH);

    }


}
