package Module7.Task7_3;

import Module7.Controller;
import Module7.Currency;
import Module7.Order;

import java.util.*;

public class TreeSetController {
    Controller controller = new Controller();
    Set<Order> orders = new TreeSet<>();
    Queue<Order> queue = new PriorityQueue<>(new Comparator<Order>() {
        @Override
        public int compare(Order o1, Order o2) {
            return o2.getPrice() - o1.getPrice();
        }
    });

    {
        orders.addAll(controller.getListOrder());
    }

    public void printAll() {
        orders.forEach(order -> {
            System.out.println(order);
        });
    }

    void findaLastName(String lastName) {
        orders.forEach(order -> {
            if (order.getUser().getLastName().equals(lastName))
                System.out.println(order);
        });
    }

    void mostLargestPrice() {
        queue.addAll(orders);
        System.out.println("  mostLargestPrice ");
        System.out.println(queue.poll());

    }

    void deleteForCurency(Currency currency) {
        Iterator<Order> iterator = orders.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getCurrency().equals(currency)) {
                iterator.remove();
            }
        }
        System.out.println("  deleteForCurency(Currency currency) ");
        for (Order order : orders) {
            System.out.println(order);
        }
    }

}
