package Module7;

import java.util.*;

public class Controller {
    List<User> listUser = new ArrayList<>();
    List<Order> listOrder = new ArrayList<>();
    String[] cities = {"Amarillo", "Birmingham", "Bellevue", "Vallejo", "Garland", "Durham", "Jackson"};
    List<Order> subsidiaryList = new ArrayList<>();
    Set<String> citiesUnique = new TreeSet<>();

    public Controller() {
        listUser.add(new User(1, "Cramer", "Oldridge", "Garland", 102));
        listUser.add(new User(2, "Faber", "Molligan", "Birmingham", 45));
        listUser.add(new User(3, "Duncan", "Osborne", "Bellevue", 78));
        listUser.add(new User(4, "Dyson", "Marlow", "Vallejo", 69));
        listUser.add(new User(5, "Elmers", "Philips", "Garland", 58));
        listUser.add(new User(6, "Erickson", "Porter", "Durham", 45));
        listUser.add(new User(7, "Carey", "Quincy", "Jackson", 14));
        listUser.add(new User(8, "Brooks", "Ryder", "Irvine", 24));
        listUser.add(new User(9, "Higgins", "Simon", "Columbus", 5));
        listUser.add(new User(10, "Forster", "Thomson", "Jackson", 3));


        listOrder.add(new Order(1118, 3900, Currency.UAH, "Alcatel X10", "Mobil House", listUser.get(3)));
        listOrder.add(new Order(1121, 3900, Currency.UAH, "Lenovo Vibe S1", "Rozetka", listUser.get(1)));
        listOrder.add(new Order(1122, 155, Currency.USD, "Lenovo Vibe S1", "Rozetka", listUser.get(2)));
        listOrder.add(new Order(1123, 2700, Currency.UAH, "Huawei Y6", "Mobilochka", listUser.get(3)));
        listOrder.add(new Order(1124, 143, Currency.USD, "Lenovo A 7000", "Tehno", listUser.get(4)));
        listOrder.add(new Order(1125, 170, Currency.USD, "Samsung Galaxy J3", "Rozetka", listUser.get(5)));
        listOrder.add(new Order(1126, 205, Currency.USD, "LG G4", "MobiLux", listUser.get(6)));
        listOrder.add(new Order(1119, 3900, Currency.UAH, "Lenovo Vibe S1", "Rozetka", listUser.get(1)));
        listOrder.add(new Order(1127, 2500, Currency.UAH, "Doogee X5", "Tehno", listUser.get(7)));
        listOrder.add(new Order(1128, 105, Currency.USD, "Microsoft Lumia 550", "TTT", listUser.get(8)));
        listOrder.add(new Order(1129, 95, Currency.USD, "Lenovo A 2010", "Rozetka", listUser.get(9)));
        listOrder.add(new Order(1120, 160, Currency.USD, "Lenovo Vibe S1", "Allo", listUser.get(0)));
    }

    public Controller(List<Order> listOrder) {
        this.listOrder = listOrder;
    }

    public List<Order> getListOrder() {
        return listOrder;
    }

    void orderSortPriseDescending() {
        Collections.sort(listOrder, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                return o2.getPrice() - o1.getPrice();
            }
        });

        System.out.println("  orderSortPriseDescending");
        for (Order order : listOrder) {
            System.out.println(order);
        }
    }

    void orderSortPriseAscendingFilterCity() {
        subsidiaryList.clear();
        for (Order order : listOrder) {
            for (String string : cities) {
                if (string.equals(order.getUser().getCity())) {
                    subsidiaryList.add(order);
                }
            }
        }
        Collections.sort(subsidiaryList, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getPrice() - (o2.getPrice()) == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                return o1.getPrice() - (o2.getPrice());
            }
        });
        System.out.println("  orderSortPriseAscendingFilterCity");
        for (Order order : subsidiaryList) {
            System.out.println(order);
        }
    }

    void sortItemShopCity() {
        Collections.sort(listOrder, new Comparator<Order>() {
            @Override
            public int compare(Order o1, Order o2) {
                if (o1.getShopIdentificator().compareTo(o2.getShopIdentificator()) == 0)
                    return o1.getUser().getCity().compareTo(o2.getUser().getCity());
                if (o1.getItemName().compareTo(o2.getItemName()) == 0)
                    return o1.getShopIdentificator().compareTo(o2.getShopIdentificator());
                return o1.getItemName().compareTo(o2.getItemName());
            }
        });
        System.out.println("  sortItemShopCity ");

        listOrder.forEach(System.out::println);
    }

    void deleteDuplicates() {
        Set<Order> delDuplic = new HashSet<>();
        delDuplic.addAll(listOrder);

        System.out.println("  deleteDuplicates ");

        delDuplic.forEach(System.out::println);


    }

    void deletePriceLess(int price) {
        for (Order order : listOrder) {
            if (order.getPrice() < price)
                subsidiaryList.add(order);
        }
        listOrder.removeAll(subsidiaryList);

        System.out.println("  deletePriceLess ");
        for (Order order : listOrder) {
            System.out.println(order);
        }
    }

    void separateList(Currency currency) {
        subsidiaryList.clear();
        for (Order order : listOrder) {
            if (order.getCurrency() == currency)
                subsidiaryList.add(order);
        }

        System.out.println("  separateList  Curency: " + currency);

        for (Order order : subsidiaryList) {
            System.out.println(order);
        }
    }

    void listUniqueSitiesInUser() {

        for (User user : listUser) {
            citiesUnique.add(user.getCity());
        }
        System.out.println("  Cities in user ");
        for (String string : citiesUnique) {
            System.out.println(string);
        }
    }

    void separateUniqueSities() {
        listUniqueSitiesInUser();
        for (String city : citiesUnique) {
            System.out.println("  List unique city: " + "'" + city + "'");
            for (Order order : listOrder) {
                if (order.getUser().getCity() == city)
                    System.out.println(order);
            }
        }
    }

 /*   Order order = listOrder.stream().max((o1, o2) -> {
        return o1.getPrice() - o2.getPrice();
    }).get();

    Order order1 = listOrder.stream().max(new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return 0;
        }
    }).get();*/
}
