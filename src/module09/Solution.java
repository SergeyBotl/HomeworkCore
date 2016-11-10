package module09;

import Module07.*;
import Module07.Currency;

import java.util.*;
import java.util.stream.Collectors;

class Solution {

    private Controller controller = new Controller();
    private List<Order> orderList = new ArrayList<>();

    List<Order> getList() {
        orderList.clear();
        orderList.addAll(controller.getListOrder());
        return orderList;
    }

    List<Order> sortPriceDescripte(List<Order> orderList) {
        System.out.println("  sortPriceDescripte ");
        Collections.sort(orderList, (a, b) -> b.getPrice() - a.getPrice());
        return orderList;
    }

    List<Order> sortByOrderPriceIncreaseUserCity(List<Order> orderList) {
        System.out.println("  sortByOrderPriceIncreaseUserCity ");

        Comparator<Order> byPrice = (o1, o2) -> o1.getPrice() - o2.getPrice();
        Comparator<Order> byUserCity = (o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity());

        return orderList
                .stream()
                .sorted(byPrice.thenComparing(byUserCity))
                .collect(Collectors.toList());
    }

    List<Order> sortOrderItemNameShopIdentificatorUserCity(List<Order> orderList) {
        System.out.println("  sortOrderItemNameShopIdentificatorUserCity ");

        Comparator<Order> byItemName = (o1, o2) -> o1.getItemName().compareTo(o2.getItemName());
        Comparator<Order> byShopIdentificator = (o1, o2) -> o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
        Comparator<Order> byUserCity = (o1, o2) -> o1.getUser().getCity().compareTo(o2.getUser().getCity());

        return orderList
                .stream()
                .sorted(byItemName.thenComparing(byShopIdentificator).thenComparing(byUserCity))
                .collect(Collectors.toList());
    }

    List<Order> deleteDuplicates(List<Order> orderList) {
        System.out.println("  deleteDuplicates");
        return orderList.stream().distinct().collect(Collectors.toList());

    }

    List<Order> deletePriceLess(List<Order> orderList, int price) {
        System.out.println("  deletePriceLess");
        orderList.removeIf(p -> p.getPrice() < price);

        return orderList;
    }

    List<Order> separateListCurrency(List<Order> orders, Currency currency) {
        System.out.println("  separateList:" + currency);
        // Predicate<Order> separCurrensy = (Order o) -> o.getCurrency().equals(currency);
        return orders
                .stream()
                .filter(o -> o.getCurrency().equals(currency))
                .collect(Collectors.toList());
    }

    List<List<Order>> separateUniqueCity(List<Order> orders) {
        System.out.println("  separateUniqueCity");
        Map<String, List<Order>> map = orders.stream().collect(Collectors.groupingBy(order -> order.getUser().getCity()));
        List<List<Order>> lists = new ArrayList<>();
        map.forEach((s, res) -> lists.add(res));

        return lists;
    }

    List<Order> checkOrderlastName(List<Order> orderList, String lastName) {
        System.out.println("  checkOrderlastName: '" + lastName + "'");
        return orderList
                .stream()
                .filter(order -> order.getUser().getLastName().equals(lastName))
                .collect(Collectors.toList());
    }

    List<Order> deleteByCurrency(List<Order> orderList, Currency currency) {
        System.out.println("  deleteByCurrency: '" + currency + "'");
        orderList.removeIf(p -> p.getCurrency().equals(currency));

        return orderList;
    }

    void print(Collection<Order> list) {
        list.forEach(System.out::println);
    }

    void print(List<List<Order>> lists) {
        lists.forEach(System.out::println);
    }

}
//http://www.leveluplunch.com/java/tutorials/007-sort-arraylist-stream-of-objects-in-java8/