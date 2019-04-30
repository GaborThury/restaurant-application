package robot;

import domain.Client;
import domain.Food;
import domain.Order;
import factory.FoodFactory;

import java.util.LinkedList;
import java.util.Queue;

public class CookRobot {

    private final Queue<Order> orders = new LinkedList<Order>();

    public CookRobot() {
    }

    public void addOrder(Client client, Order order) {
        order.addObserver(client);
        orders.add(order);
        System.out.format("CookRobot: Order registered, Client: %s, Order: %s \n",
                client.toString(), order.toString());
    }

    public void processOrders() {
        System.out.println("CookRobot: Processing " + orders.size() + " order(s)...");

        orders.forEach(order -> {
            Food food = FoodFactory.createFood(order);
            order.notifyObservers(food);
        });
        orders.clear();
        System.out.println("CookRobot: Orders processed.");
    }

}
