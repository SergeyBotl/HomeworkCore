package module09;

import static Module07.Currency.UAH;
import static Module07.Currency.USD;

public class Main {
    public static void main(String[] args) {

        Solution solution = new Solution();

        solution.print(solution.sortPriceDescripte(solution.getList()));
        solution.print(solution.sortByOrderPriceIncreaseUserCity(solution.getList()));
        solution.print(solution.sortOrderItemNameShopIdentificatorUserCity(solution.getList()));
        solution.print(solution.deleteDuplicates(solution.getList()));
        solution.print(solution.deletePriceLess(solution.getList(), 1500));
        solution.print(solution.separateListCurrency(solution.getList(), USD));
        solution.print(solution.separateListCurrency(solution.getList(), UAH));
        solution.print(solution.separateUniqueCity(solution.getList()));
        solution.print(solution.checkOrderlastName(solution.getList(), "Marlow"));
        solution.print(solution.deleteByCurrency(solution.getList(), USD));


    }
}
